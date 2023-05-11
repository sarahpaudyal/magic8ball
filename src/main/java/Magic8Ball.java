import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {

        //Get the user to enter a question for the magic 8-ball to answer
           Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 4");
           String userQuestion = scanner.nextLine();


        // 3. Make a variable and initialize it to a random number.
        //
        //    // Get random a number from: [0, 1, 2, 3]
         int randNumber = new Random().nextInt(4);

        if (randNumber == 0){
            System.out.println("Yes");
        }
        // 4. If the random number is 0

        // Tell the user "Yes"

        if(randNumber ==1){
            System.out.println("No");
        }
        // 5. If the random number is 1

        // Tell the user "No"

        if (randNumber == 2) {

            System.out.println("Good Job");
        }
        // 6. If the random number is 2

        // Tell the user a custom response


        // 7. If the random number is 3
        if (randNumber ==3){
            System.out.println("Excllent job");
        }
        // Tell the user a custom response
    }
}


