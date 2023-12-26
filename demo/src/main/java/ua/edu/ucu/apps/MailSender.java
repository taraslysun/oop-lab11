/*MailSender
sendMail(MailInfo). */

package main.java.ua.edu.ucu.apps;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Sent to " + mailInfo.getClient().getName() + ". Code: " + mailInfo.getMailCode());
    }
}
