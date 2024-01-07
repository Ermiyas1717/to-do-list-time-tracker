import java.util.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now();
//        System.out.println(myObj);

        Tracker tracer = new Tracker() ;
        tracer.toDoNumber = 1;
        tracer.toDOName = "hacking website";
        tracer.remainTime = myObj;

        System.out.println(tracer.toDoNumber);
        System.out.println(tracer.toDOName);
        System.out.println(tracer.remainTime);

    }
}
