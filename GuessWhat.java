
import java.util.*;

public class GuessWhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("     ");
        System.out.print("     ");
        System.out.println("         welcome to guess what game");
        while (true) {
            System.out.println("---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*");
            try {
                System.out.println("guess the lucky number 1-10");
                int number = random.nextInt(10) + 1;
                int no1 = scanner.nextInt();
                if (no1 == number) {
                    System.out.println("congratulations you have won the game");
                    System.out.println("do you want to play again?");
                    System.out.println("press 1 for yes and 0 for no");
                    int choice = scanner.nextInt();
                    if (choice == 0) {
                        break;
                    }
                } else {
                    if (no1 > number) {
                        System.out.println("your number is greater than the lucky number!! try again");
                    } else {
                        System.out.println("your number is less than the lucky number, try again!!");
                    }
                    int no2 = scanner.nextInt();
                    if (no2 == number) {
                        System.out.println("congratulations you have won the game");
                    } else {
                        if (no2 > number) {
                        System.out.println("your number is greater than the lucky number!! last try");
                    } else {
                        System.out.println("your number is less than the lucky number, last try!!");
                    }
                        int no3 = scanner.nextInt();
                        if (no3 == number) {
                            System.out.println("congratulations you have won the game");
                        } else {
                            System.out.println("you have lost the game, the lucky number was " + number);
                        }
                    }
                    System.out.println("do you want to play again?");
                    System.out.println("press 1 for yes and 0 for no");
                    int choice = scanner.nextInt();
                    if (choice == 0) {
                        System.out.println("Exiting...");
                        break;
                    }
                }

            } catch (Exception e) {
                System.out.println("please enter a valid number");
                scanner.next();
            }
        }
        System.out.println("---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*");
        scanner.close();
    }
}
//this is a simple game where the user has to guess the lucky number between 1-10
//if the user guesses the number correctly, he wins the game
//if the user guesses the number incorrectly, he has 2 more chances to guess the number
//if the user fails to guess the number in 3 chances, he loses the game
//the user can play the game as many times as he wants
//the user can exit the game by pressing 0
//the user can play the game again by pressing 1
//the user has to enter a valid number, if he enters any other character, he will be prompted to enter a valid number
