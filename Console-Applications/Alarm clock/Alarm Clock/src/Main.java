import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filepath = "src\\Music.wav";

        while(alarmTime == null){
            try {
                System.out.println("**********⏰ALARM CLOCK⏰**********");
                System.out.print("Set Alarm Time (HH:MM:SS)🔔: ");
                String response = scanner.nextLine();

                alarmTime = LocalTime.parse(response, formatter);
                System.out.println("Alarm Set For " + alarmTime);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid Format!!");
            }
        }

        Alarm_Clock alarmClock = new Alarm_Clock(alarmTime,filepath,scanner);
        Thread alarmThread = new Thread(alarmClock);

        alarmThread.start();
    }
}