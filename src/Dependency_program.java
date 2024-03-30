// Service Interface
interface MessageService {
    String getMessage();
}

//implementation of Message Service
class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Email Message";
    }
}
public class Dependency_program {

}
