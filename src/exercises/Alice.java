package exercises;

import java.util.Scanner;


public class Alice {

    public static void main(String[] args) {
        //Prints "Hello, Alice" to the terminal window.
        String text;

        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine();

        System.out.println("Hello, " + text);

    }
}
