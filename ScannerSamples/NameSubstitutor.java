package RoKo.ScannerSamples;
import java.util.Scanner;
/**
 * Created by Roma on 16.03.2017.
 */
public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message: ");
        String str = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        String replace = str.replace("${name}", name );
        System.out.println( replace);
    }
}
