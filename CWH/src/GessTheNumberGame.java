import java.util.Random;
import java.util.Scanner;

class Game{
    int randnumber;
    int attempts;
    Random random =new Random();
    Scanner sc= new Scanner(System.in);
    int input;

    public Game() {
        randnumber= random.nextInt(10);
        attempts=0;
        takeinput();
    }
    public void takeinput(){
        System.out.print("Enter the number: ");
        input=sc.nextInt();
        isCorrectNumber();
    }
    public void isCorrectNumber(){
        attempts+=1;
        if(randnumber==input){
            System.out.println(input+" is Correct Gess in "+attempts+ " Attempts" );
        }else{
            System.out.println("Wrong Guess!! Try Again");
            takeinput();
        }
    }
}

public class GessTheNumberGame {

    public static void main(String[] args) {
        // Create a class Game, which allows a user to play "Guess the Number"
        // game once. Game should have the following methods:
        // 1. Constructor to generate the random number
        // 2. takeUserInput() to take a user input of number
        // 3. isCorrect Number() to detect whether the number entered by the user is true
        // 4. getter and setter for number of gesses  
        // Use properties such as no0fGuesses(int), etc to get this task done!

        Game game= new Game();
        


    }
    
}
