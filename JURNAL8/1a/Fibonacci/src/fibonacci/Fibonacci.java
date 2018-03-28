package fibonacci;

import java.util.Scanner;


public class Fibonacci {

   public static void main(String args[]) {
 
	log("Masukkan Angka : ");
	int number = new Scanner(System.in).nextInt();
        log("\nNomor Fibonacci dari " + number + " adalah " + (fibonacciLoop(number) + ""));
	}
	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
 
		}
		return fibonacci;
	}
 
	private static void log(String number) {
		System.out.println(number);
 
	}
 
}
