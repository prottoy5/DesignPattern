//SingleResponsibility
public class SingleResponsibility {
     
    public static void main(String[] args) {

        User user1 = new User();
        EmailService email1 = new EmailService();

        user1.login("Prottoy", "Password");
        email1.sendEmail("Sani ", "SADP ", "Null ");
    }
}
