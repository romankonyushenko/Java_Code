package RoKo.ScannerSamples;
import java.util.Scanner;
/**
 * Created by Roma on 16.03.2017.
 */
public class SimpleAboutMeSample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter your surname:");
        String surname = scanner.nextLine();

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("I'm " + name + " " + surname + "," + age + " yaers old");

    }
}
