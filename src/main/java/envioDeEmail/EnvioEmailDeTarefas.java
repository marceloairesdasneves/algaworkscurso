package envioDeEmail;
// @author Marcelo Neves
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnvioEmailDeTarefas {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("mneves230@gmail.com", "etze aqih aqfw mzbu\n"));
        email.setSSLOnConnect(true);
        email.setFrom("mneves230@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("marceloneves2@icloud.com");
        email.send();
        System.out.println("Email enviado com sucesso!");
    }
}
