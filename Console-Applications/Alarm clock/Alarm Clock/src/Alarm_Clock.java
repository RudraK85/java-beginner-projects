import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Alarm_Clock implements Runnable{

    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner scanner;

    Alarm_Clock(LocalTime alarmTime,String filepath,Scanner scanner){
        this.alarmTime = alarmTime;
        this.filepath = filepath;
        this.scanner = scanner;
    }

    @Override
    public void run(){
        while(LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread Was Interrupted");
            }
        }
        System.out.println("\n**********⏰AlARM NOISES⏰**********");
        playSound(filepath);

    }
    private void playSound(String filepath){

        File audioFile = new File(filepath);

        try( AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);){
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            System.out.print("PRESS \"ENTER\"↩\uFE0F TO STOP THE ALARM: ");
            scanner.nextLine();
            clip.stop();
            
            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio File Format Not Supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio Is Unavailable");
        }
        catch(IOException e){
            System.out.println("Something Went Wrong");
        }

    }
}
