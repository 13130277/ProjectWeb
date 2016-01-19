package Model;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Mail {

	public static void send(String smtpServer, String to, String from,
			String psw, String subject, String body) throws Exception {
		Properties props = System.getProperties();
		props.put("mail.smtp.host", smtpServer);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		final String login = from;
		final String pwd = psw;
		Authenticator pa = null;
		if (login != null && pwd != null) {
			props.put("mail.smtp.auth", "true");
			pa = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(login, pwd);
				}
			};
		}// else: no authentication
		Session session = Session.getInstance(props, pa);
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(from));
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to,
				false));

		msg.setSubject(subject);
		msg.setText(body);
		msg.setHeader("X-Mailer", "LOTONtechEmail");
		msg.setSentDate(new Date());
		msg.saveChanges();
		Transport.send(msg);
		System.out.println("Gui Mail Thanh Cong");

	}

	/* Tao pt static */
	public static void guiMail(String mail) {
		try {
			String smtpServer = "smtp.gmail.com";
			String to = mail;
			String from = "mr.luanxt@gmail.com";
			String subject = "Kiem Tra Tieu De";
			String body = "Kiem tra noi dung";
			String password = "khongbiet";
			send(smtpServer, to, from, password, subject, body);
			System.out.println("Finish!");
		} catch (Exception ex) {
			System.out.println("Khong The Ket Noi Internet");
		}
	}

	public static void main(String[] args) {
		{
			try {
				String smtpServer = "smtp.gmail.com";
				String to = "LuanXT.Info@yahoo.com";
				String from = "Mr.LuanXT@gmail.com";
				String subject = "Kiem Tra Tieu De";
				String body = "Kiem Tra Noi Dung";
				String password = "khongbiet";
				System.out.println("Gui Mai Thanh Cong!");
				send(smtpServer, to, from, password, subject, body);
				System.out.println("Gui Thanh Cong");
			} catch (Exception ex) {
				System.out.println("Khong The Ket Noi Internet");
			}

		}

	}

}
