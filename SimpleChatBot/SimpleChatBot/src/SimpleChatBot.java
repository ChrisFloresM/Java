import java.util.Scanner;

public class SimpleChatBot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, my name is Bot");
        System.out.println("I was created in 2024");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name +"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove you that I can count to any number you want.");

        int number = scanner.nextInt();

        for (int i = 0; i <= number ; i++){
            System.out.println(i + "!");
        }

        System.out.println("Lets test your programmingk nowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a staement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        for (;;) {
            int userAnswer = scanner.nextInt();
            if (userAnswer == 2) {
                System.out.println("Congratulations, have a nice day!");
                break;
            }

            System.out.println("Please, try again.");
        }
    }
}
