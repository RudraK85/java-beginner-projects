import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("Welcome To The Java Quiz Game!");
        System.out.println("******************************");

        String[] questions={"What does \"URL\" stand for?",
                            "Which company owns Android?",
                            "What is the main purpose of a VPN?",
                            "Which protocol is used for secure websites?",
                            "What does \"Wi-Fi\" commonly refer to?"};
        
        String[][] options={{"1.User Read Line","2.Uniform Resource Locator","3.Universal Router Link","4.Unique Resource Link"},
                            {"1.Apple","2.Microsoft","3.Google","4.Samsung"},
                            {"1.Faster downloads","2.Hide IP","3.Boost RAM","4.Block ads"},
                            {"1.FTP","2.HTTP","3.SSH","4.HTTPS"},
                            {"1.Wireless Fidelity","2.Web Finder","3.Wide File","4.Wired Fibre"}};

        int[] answer={2,3,2,4,1};
        int score=0;
        int guess;
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.println();
            System.out.print("Enter The Correct Option:");
            guess = scanner.nextInt();
            
            if(guess == answer[i]){
                System.out.println("**********");
                System.out.println("CORRECT :)");
                System.out.println("**********");
                score++;
            }
            else{
                System.out.println("********");
                System.out.println("WRONG :(");
                System.out.println("********");
            }
        }
        System.out.println("Your Final Score Is: " + score + " Out Of "+ questions.length);
       scanner.close();
    }
}
