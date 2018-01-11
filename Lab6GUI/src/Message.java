
import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    User from;
    Recipient to;
    Date whenSent;
    String message;
   
}
