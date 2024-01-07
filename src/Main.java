import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Tracker tracer = new Tracker() ;
        tracer.toDoNumber = 1;
        tracer.toDOName = "hacking website";
//        tracer.toDoDate = Date.from()
        System.out.println(tracer.toDoNumber);
        System.out.println(tracer.toDOName);
        System.out.println(tracer.toDoDate);

    }
}