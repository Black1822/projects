package learningfile;
import java.util.Scanner;

public class projecttt {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int theNumber = (int) (Math.random() * 100);
        int theGuess = -1;
        int guessCount = 0;

        while (theGuess != theNumber) {
            System.out.println("Input your Guess (0-100) you can guess 10 times");
            theGuess = tara.nextInt();
            guessCount++;
            System.out.println("GUESS COUNT= "+ guessCount);
            if (theGuess == theNumber) {
                System.out.println("Great Job! you found the number " + guessCount + ". times");
            } else if (theGuess < 0) {
                System.out.println("I said between 0-100");
            } else if (theGuess > 100) {
                System.out.println("I said between 0-100");
            } else if (theGuess > 1000) {
                System.out.println("bro are you milk ?");
            } else if (theGuess > theNumber) {
                System.out.println("You guessed too big number");
            } else if (guessCount > 9) {
                System.out.println("u guessed too many wrong number, try again");
                System.out.println("The number was "+theNumber);
                break;
            } else System.out.println("You guessed too small number");
        }
    }
}





