import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        int guess = keyboard.nextInt();
        
        int n = 7;
        while (n != guess) {
            System.out.println("That is incorrect. Guess again.");
            guess = keyboard.nextInt();
        }
        
        System.out.println("That's right! You're a good guesser.");
    }
 }
