import java.util.Random;
import java.util.Scanner;


public class Task1{
    public static void main(String[] args){
        Random ran = new Random();

        Scanner sc = new Scanner(System.in);

        int randomnum = ran.nextInt(100) + 1;

        int guess = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("A number from 1-100 is being generated. Try to guess it.");

        while(guess != randomnum){
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();

            if(guess < randomnum){
                System.out.println("Too low...try again");
            }
            else if(guess > randomnum){
                System.out.println("Too high...try again");
            }
            else{
                System.out.println("Congratulations! You have guessed the number.");
            }

        }

        sc.close();
    }

}