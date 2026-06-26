package envioDeEmail;
// @author Marcelo Neves
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
    public static void enviar(String usuario, String senha, String para, String assunto, String msg) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setAuthenticator(new DefaultAuthenticator(usuario, senha)); //etze aqih aqfw mzbu
        email.setSSLOnConnect(true);
        email.setFrom("mneves230@gmail.com");
        email.setSubject(assunto);
        email.setMsg(msg);
        email.addTo(para);
        email.send();
        System.out.println("Email enviado com sucesso!");
    }
}
