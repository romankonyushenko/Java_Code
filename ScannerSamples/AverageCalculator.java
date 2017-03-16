package RoKo.ScannerSamples;
import java.util.Scanner;
/**
 * Created by Roma on 16.03.2017.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int result = (a/2+b/2)+(a%2+b%2)/2;
        System.out.println("result = " + result);
    }
}
