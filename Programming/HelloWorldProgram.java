import java.util.Scanner;

public class HelloWorldProgram {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello World!" + keyboard.nextLine() );
        System.out.println("What is your name?" );
        System.out.println("Hello, "  + keyboard.nextLine() );

    }
}