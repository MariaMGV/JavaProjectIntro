package intro;
import java.util.Scanner;

public class ReadingFromConsole
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);


        System.out.println("Please, enter your name:");
        String userName = sc.nextLine();

        System.out.println("Nice to meet yoy, " + userName + "!");

        System.out.println("Please, enter your age:");
        int userAge = sc.nextInt();
        System.out.println("What a wonderful age -" + " " + userAge + "!");

    }
}
