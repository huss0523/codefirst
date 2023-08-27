import java.util.Scanner;

public class exper {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstname = keyboard.nextLine();
        System.out.println("What is your last name?");
        String lastname = keyboard.nextLine();
        String fullName = firstname +  " " + lastname ;

        System.out.println("Hello, " + fullName);

        System.out.println("What year were you born?");
        int yearBorn = keyboard.nextInt();
        int current_year = 2023;
        int age = current_year - yearBorn;
        System.out.printf("You're %d years old! ",age);

        System.out.printf("%n%nHow old is %s? ", fullName);
        int ageGuess = keyboard.nextInt();

        if (ageGuess == age) {
            System.out.println("Correct");
            // Addittional message for player with correct input
            System.out.println("You have gussed correctly! You are so good!");




        } else {
            System.out.println("False");
            // Addittional message for player with wrong input
            System.out.println("That is unfortunately wrong. Thanks for playing!");
        }

    }
}
