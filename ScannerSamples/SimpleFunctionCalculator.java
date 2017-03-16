package RoKo.ScannerSamples;

import java.util.Scanner;

public class SimpleFunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = (double) scanner.nextDouble();
        double sin = Math.sin(x);
        double pow = Math.pow(Math.E, x);
        double fraction = Math.sqrt(x) / Math.PI;
        double result = Math.log(sin + pow * fraction);

        System.out.println("f(x) = " + result);
    }
}
