import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean result = true;
        while(result==true) {
            System.out.println("i love u");
            System.out.println("would you like to continue?");
            result = input.nextBoolean();
        }
        System.out.println("finish");

    }
}