import java.util.Scanner;



public class App {



    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) throws Exception {



        drivingTest("Driving test!");

        scan.close();

    }



    static void drivingTest(String drive) {



        System.out.println("Driving result");

        train(drive);



        String feedback = instructorfeedback(drive);



        // Define the base case / stopping condition

        if (feedback.equals("no")) {



            // Do something to reach the goal

            retaking(drive);



            // Recursive call

            drivingTest(drive);

        } else if (feedback.equals("yes")) {

            Passing(drive);

        }

    }

    static void train(String drive) {
        System.out.println("Testing");

    }



    static String instructorfeedback(String drive) {
        System.out.println("Did you passed  " + drive + " the test? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();



        return feedback;

    }



    static void retaking(String drive) {

        System.out.print("Retake the test?");

        String ingredient = scan.next();

        System.out.println("Fixing schedule. Added " + ingredient);

    }



    static void Passing(String drive) {

        System.out.println("Congrats you passed the " + drive);

    }



}