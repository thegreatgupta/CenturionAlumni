package com.deciders.alumni.mail;

public class MailThread extends Thread{
	
	EmailSendingServlet mail = null;
	
	public MailThread(EmailSendingServlet mail) 
	{     
		this.mail = mail;
	}	
	public void run()
	{		
		mail.newMail(mail);
	}
}
