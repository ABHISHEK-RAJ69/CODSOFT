package Java_Development_internship;

import java.util.Scanner;

public class Number_game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number game !");
        // Rules
        while (true) {

            System.out.println("Rules:-");
            System.out.println("This game contains 3 rounds.");
            System.out.println("You will get 5 chances to guess the number.");
            System.out.println("correct guess will give you 100 points.");
            System.out.println("wrong guess grants you 0 points.");
            System.out.println("Let's Start.");
            int score = 0;
            for (int i = 1; i < 4; i++) {
                System.out.println("Welcome to round " + i + " !");
                int n = 1 + (int) (Math.random() * 100); // generate number between 1-100
                System.out.println("The number is between 1 - 100.");
                for (int j = 0; j < 5; j++) {
                    // Guessing part
                    System.out.println("Enter your guess.");
                    int num = sc.nextInt();
                    if (num == n) {
                        System.out.println("Congrats you got it right. \nThe number was " + n);
                        score += 100;
                        break;
                    } else if (num > n) {
                        if (num - 10 > n) {
                            System.out.println("Too high");
                        } else {
                            System.out.println("Too close");
                        }
                    } else {
                        if (num + 10 < n) {
                            System.out.println("too low");
                        } else {
                            System.out.println("Too close");
                        }
                    }
                    if (j != 4) {
                        System.out.println("Try again");
                    } else {
                        System.out.println("You didn't got the number");
                        System.out.println("The number was " + n);
                        if (i != 3) {
                            System.out.println("Good luck for the next round");
                        } else {
                            System.out.println("Game Over!");
                        }
                    }
                }

            }
            System.out.println("You scored " + score);
            //Exit option
            System.out.println("Do you wanna Exit?");
            System.out.println("If yes press  y , if not press any key");
            char ch = sc.next().toLowerCase().charAt(0);
            if (ch == 'y') {
                System.out.println("Thanks for playing the game . It was fun !");
                break;
            }
            
        }
        sc.close();
    }
}
