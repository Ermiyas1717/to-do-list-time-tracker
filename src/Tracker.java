import javax.naming.Name;
import java.util.Date;
import java.time.LocalDate;

public class Tracker {
    String toDOName;
    LocalDate toDoDate, remainTime;
    int toDoNumber;

    void trac(int no, String name, LocalDate date, LocalDate remain){
        toDoNumber = no;
        toDOName = name;
        toDoDate  = date;
        remainTime = remain;
}


}
