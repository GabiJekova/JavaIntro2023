package qa.intro;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, human");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");

        String userName = scanner.nextLine();

        System.out.println("Nice to meet you, " + userName + "!");

        System.out.println("Please enter your age:");

        int userAge = scanner.nextInt();

        if (userAge < 18){
            System.out.println(userName + " is not allowed to drink!");
        }else {
            System.out.println("Cheers, " + userName + "!");
        }
    }}
