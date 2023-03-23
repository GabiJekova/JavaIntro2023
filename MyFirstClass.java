package qa.intro;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, human!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");

        String userName = scanner.nextLine();

        System.out.println("Nice to meet you, " + userName + "!");

        System.out.println("We are collecting the best hobbies ideas. Please enter your favorite one:");

        String Hobby = scanner.nextLine();

        if (Hobby.equals("climbing")){
            System.out.println(userName + " that's great! Be careful! Thank you!");
                    }
        else {
            System.out.println("That's nice! Enjoy, " + userName + "! Thank you!");
        }
    }}
