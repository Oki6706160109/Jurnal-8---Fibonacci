package fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Fibonacci {

   Scanner scan;
    int a1, b1, c1, a2, b2, c2, limit, i;
    public Fibonacci() {
        scan = new Scanner(System.in);
        a1 = c1 = 1;
        b1 = a2 = b2 = c2 = limit = i = 0;
    }
    public void input() {
        try {
            System.out.printf("Masukkan Nomor : ");
            limit = scan.nextInt();
            scan.close();
        } catch (InputMismatchException | NumberFormatException e) {
            System.err.println("Error Occurred!");
            System.exit(0);
        }
    }
    public void compute() {
        for (; i < limit; i++) {
            a1 = b1;
            b1 = c1;
            c1 = a1 + b1;
            a2 = c1;
            c2 = b1;
        }
        System.out.println("Hasil Terbalik: ");
        System.out.println(a2 + c2);
        for (i = limit - 1; i >= 0; i--) {
            b2 = a2;
            a2 = c2;
            c2 = b2 - a2;
            System.out.println(c2);
        }
    }
    public static void main(String[] args) {
        Fibonacci fr = new Fibonacci();
        fr.input();
        fr.compute();
    }
}
