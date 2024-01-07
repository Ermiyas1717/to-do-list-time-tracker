import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Tracker tracer = new Tracker() ;

        System.out.println("enter project number ");
        tracer.toDoNumber = scan.nextInt();
        System.out.println("enter project name ");
        tracer.toDoName = scan.nextLine();
        System.out.print("Enter the finishing date of the activity (yyyy-MM-dd HH:mm:ss): ");
        tracer.toDoDate = scan.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime finishingDate = LocalDateTime.parse(tracer.toDoDate, formatter);
        LocalDateTime currentDate = LocalDateTime.now();
        Duration duration = Duration.between(currentDate, finishingDate);

        long remainingDays = duration.toDays();
        long remainingHours = duration.toHours() % 24;
        long remainingMinutes = duration.toMinutes() % 60;
        long remainingSeconds = duration.getSeconds() % 60;

        System.out.println("tracer to Do Number " + tracer.toDoNumber);
        System.out.println("tracer to Do Name " + tracer.toDoName);
        System.out.println("Remaining time: " + remainingDays + " days, " + remainingHours + " hours, " + remainingMinutes + " minutes, " + remainingSeconds + " seconds.");

    }
}
