import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.mail.*;

@SuppressWarnings("serial")
public class  mail2 extends JFrame
{
	static String popServer;
	static String popUser;
	static String popPassword;
               public static void main(String args[])
               {
            	   	//popServer=args[0];
           			//popUser=args[1];
           			//popPassword=args[2];
                    JFrame frame = new mailframe();
                    frame.setVisible(true);
               }
       }

@SuppressWarnings("serial")
class mailframe extends JFrame implements ActionListener
{
	JLabel lserver =new JLabel("SMTP Server");
	static JTextField tserver = new JTextField(15);
	JLabel luname =new JLabel("UserName");
	static JTextField tuname = new JTextField(15);
	JLabel lpass =new JLabel("Password");
	static JPasswordField tpass = new JPasswordField(15);
	static JTextArea message = new JTextArea(30,72);
	
	public mailframe()
	{
		this.setSize(850,500);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
		);
		
		tpass.setEchoChar('*');
		
		this.add(lserver);
		this.add(tserver);
		this.add(luname);
		this.add(tuname);
		this.add(lpass);
		this.add(tpass);

		JButton b1 =new JButton("Fetch");
		b1.addActionListener(this);
		this.add(b1);
		
		message.setEditable(false);
		JScrollPane sp =  new JScrollPane();
		message.add(sp);
		this.add(message);
		

	}
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("debug button");
		fetchmail();		
	}
	@SuppressWarnings("deprecation")
	private void fetchmail() 
	{
		
		String popServer;
		String popUser;
		String popPassword;
		
		popServer = mailframe.tserver.getText();
		popUser = mailframe.tuname.getText();
		popPassword = mailframe.tpass.getText();
		
		System.out.println(popServer);
		try
		{
			receive(popServer, popUser, popPassword);
			//receive("mail.imparttechnologies.com","testproject@imparttechnologies.com", "password123");
		}
		catch (Exception ex)
		{
			System.out.println("Usage: java jmail"+" smtpServer address password ");
		}
		
		//System.exit(0);
		
		}
		public static void receive(String popServer, String popUser, String popPassword){
			Store store=null;
			Folder folder=null;
			try
			{
				Properties props = System.getProperties();
				Session session = Session.getDefaultInstance(props, null);
				store = session.getStore("pop3");
				store.connect(popServer, popUser, popPassword);

				folder = store.getDefaultFolder();
				if (folder == null) throw new Exception("No default folder");
				
				folder = folder.getFolder("INBOX");
				if (folder == null) throw new Exception("No POP3 INBOX");
				
				folder.open(Folder.READ_ONLY);
				Message msgs[] = folder.getMessages();
				BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
				
				mailframe.message.setText("");				
				int msgNum;
				for (msgNum = 0; msgNum < msgs.length; msgNum++)
				{
					System.out.println(msgNum +": "+ msgs[msgNum].getFrom()[0]+ "\t" + msgs[msgNum].getSubject());
					System.out.println("Do you want to read message? [YES to read/QUIT to end]");
					String line = reader.readLine();
					String y = "yes";
					int j = line.compareTo(y);
					if (j == 0)
					{
						//System.out.println(((Message)msgs[msgNum].getContent()).toString());
						//System.out.println(msgNum +": "+ msgs[msgNum].getFrom()[0]+ "\t" + msgs[msgNum].getSubject());				
						msgs[msgNum].writeTo(System.out);					
						//test run start -------->
						Object content = msgs[msgNum].getContent();
						
						if (content instanceof Multipart)
						{
				            StringBuffer messageContent = new StringBuffer();
				            StringBuffer msg = new StringBuffer();
				            Multipart multipart = (Multipart) content;
				            for (int i = 0; i < multipart.getCount(); i++) 
				            {
				                Part part = (Part) multipart.getBodyPart(i);
				                if (part.isMimeType("text/plain")) 
				                {
				                    msg = messageContent.append(part.getContent().toString());		                    
				                    String msg1 = new String();
				                    String from = new String();
				                    String subj = new String();
				                    int k ;
				                    k = msgNum;
				                    
				                    msg1 = msg.toString();
				                    subj = msgs[msgNum].getSubject();
				                    from = msgs[msgNum].getFrom()[0].toString();
				                    
				                    mailframe.message.append("Message No:"+(k+1)+"\n");
				                    mailframe.message.append("Message From:"+from+"\n");
				                    mailframe.message.append("Message Subject:"+subj+"\n");
				                    mailframe.message.append("\n"+msg1+"\n");
				                    
				                }
				            }
				            //return messageContent.toString();
				        
						} else 
						{
				            //return content.toString();
				        }
						
						
						//System.out.println("Debug 1 -> for 1 -> if yes");
					}
					else
					{
						System.out.println("Closing Previous Message. Going For Next.");
						//break;
					}
					//msgs[msgNum].writeTo(System.out);
				}
				
				//System.exit(0);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				try
				{
					if (folder!=null) folder.close(false);
					if (store!=null) store.close();
				}
				catch (Exception ex2) {ex2.printStackTrace();}
			}
		}
}