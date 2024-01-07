import javax.naming.Name;
import java.util.Date;

public class Tracker {
    String toDOName;
    Date toDoDate, remainTime;
    int toDoNumber;

    void trac(int no, String name, Date date, Date remain){
        toDoNumber = no;
        toDOName = name;
        toDoDate  = date;
        remainTime = remain;
}


}
