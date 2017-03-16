package RoKo.ScannerSamples;

import java.util.Scanner;

/**
 * Created by Roma on 16.03.2017.
 */
public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X in Bin: ");
        int bin = scanner.nextInt(2);


        System.out.print("Enter Y in Oct: ");
        int oct = scanner.nextInt(8);


        System.out.print("Enter Z in Hex: ");
        int hex = scanner.nextInt(16);

        System.out.print("X + Y + Z = " + (bin + hex + oct));
    }
}
