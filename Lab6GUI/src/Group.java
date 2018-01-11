import java.io.Serializable;
import java.util.ArrayList;

public class Group extends Recipient implements Serializable {
    ArrayList<User> members=new ArrayList<User>();  
    
}
