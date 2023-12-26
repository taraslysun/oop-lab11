 /*MailInfo
client (Client object);
mailCode (a parameter that specifies the type of email, for example, a birthday greeting or a gift letter).*/

package main.java.ua.edu.ucu.apps;

public class MailInfo {
    private Client client;
    private String mailCode;

    public MailInfo(Client client, String mailCode){
        this.client = client;
        this.mailCode = mailCode;
    }

    public Client getClient(){
        return client;
    }

    public String getMailCode(){
        return mailCode;
    }
    
}
