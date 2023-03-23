package factorial;

import java.util.Scanner;

public class main_fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int num ;
		System.out.println("ingrese el numero");
		num = scan.nextInt();
		System.out.println("el factorial de "+ num + " es "+ Factorial(num));
		

	}
	public static double Factorial (int n) {
		double a = 1;
		for(int i =2; i<=n; i++) {
			a *=i;
			
		}
		
		return a;
	}

}
