import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Driving("Student");
        scan.close();
    }

    static void Driving(String trainee) {

        System.out.println("Road Test");
        Skills(trainee);

        String feedback = getFeedBack(trainee);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixingSkills(trainee);

            // Recursive call
            Driving(trainee);
        } else if (feedback.equals("yes")) {
            serve(trainee);
        }
    }

    static void Skills(String trainee) {
        System.out.println("Driving.......");
    }

    static String getFeedBack(String trainee) {
        System.out.println("Is the " + trainee + " Smooth with the driving ? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixingSkills(String trainee) {
        System.out.print("Enter additional skills:");
        String DrivingSkills = scan.next();
        System.out.println("driving skill. Added " + DrivingSkills);
    }

    static void serve(String trainee) {
        System.out.println("Trainee can now have certificate ");
    }

}
