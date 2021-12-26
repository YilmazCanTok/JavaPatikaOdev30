import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(100);
        int remainingGuesses = 0;
        int guess;
        int guesses[] = new int[5];
        int i = 0;
        boolean iswin=false;
        System.out.println("**************************************************************************************************************************");
        System.out.println("Number Guessing Game");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        while(remainingGuesses!=5) {
            System.out.print("Please Enter a Number = ");
            guess = scanner.nextInt();
            if (guess<0 || guess>100) {
                System.out.println("The number you are looking for is greater than 0 and smaller than 100 : "+guess);
                guesses[i] = guess;
                remainingGuesses++;
                i++;
            }
            else{
                if (guess == number) {
                    System.out.println("Congratulations, you enter the correct number :"+number);
                    iswin = true;
                    break;
                }
                else if (guess>number) {
                    System.out.println("Wrong Answer. The number you are looking for is smaller than your number : "+guess);
                    guesses[i] = guess;
                    remainingGuesses++;
                    i++;
                }
                else{
                    System.out.println("Wrong Answer. The number you are looking for is higher than your number : "+guess);
                    guesses[i] = guess;
                    remainingGuesses++;
                    i++;
                }
            }
        }
        if (iswin==false) {
            System.out.println("You used all of your guesses and yet still lose the game. The number you have been looking for is : "+number);
            System.out.println("Your guesses : "+Arrays.toString(guesses));
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.println("...GAME OVER...");
        System.out.println("**************************************************************************************************************************");
    }
}
