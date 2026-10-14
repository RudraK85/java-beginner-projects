import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String Audio_location = "src\\Music.wav";
        File file = new File(Audio_location);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")){
                System.out.println("🎧MUSIC PLAYER🎧");
                System.out.println("PLAY (P): ");
                System.out.println("STOP (S): ");
                System.out.println("RESET (R): ");
                System.out.println("QUIT (Q): ");

                System.out.print("Enter Your Choice 👉:");
                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice😓");
                }
            }
        }
        catch (FileNotFoundException f){
            System.out.println("Audio File Not Founded");
        }
        catch (UnsupportedAudioFileException unsupported){
            System.out.println("Audio File Is Not Supported");
        }
        catch (LineUnavailableException l){
            System.out.println("Unable To Access The Audio File");
        }
        catch (IOException io){
            System.out.println("Something Went Wrong");
        }
        finally {
            System.out.println("😊THANKS FOR LISTENING😊");
        }
    }
}