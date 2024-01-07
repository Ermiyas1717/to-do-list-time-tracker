import javax.naming.Name;
import java.util.Date;
import java.time.LocalDate;

public class Tracker {

    String  toDoName, remainTime, toDoDate = "2024-02-17 12:00:00";
    int toDoNumber = 0;

    void trac(int no, String name, String date, String remain){
        toDoNumber = no;
        toDoName = name;
        toDoDate  = date;
        remainTime = remain;
}


}
