/*MailBox
infos (the place where all the information to be sent should be stored);
addMailInfo(MaiInfo);
sendAll(). */

package main.java.ua.edu.ucu.apps;


public class MailBox {
    private MailInfo[] infos;
    private int size;

    public MailBox(){
        infos = new MailInfo[10];
        size = 0;
    }

    public void addMailInfo(MailInfo mailInfo){
        infos[size++] = mailInfo;
    }

    public void sendAll(){
        MailSender mailSender = new MailSender();
        for (int i = 0; i < size; i++){
            mailSender.sendMail(infos[i]);
        }
    }
    
}
