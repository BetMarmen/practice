package practica;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n,r,par=0,impar=0;
		do {
		System.out.println("Ingrese hasta que numero quiere mostrar");
		n = scan.nextInt();
		}
		while(n<1);
		for(int i = 1 ; i<= n ; i++)
		{
			System.out.println("ingrese el num");
			r = scan.nextInt();
			System.out.println(r);
			if(r%2==0) {
				System.out.println("Par");
				par=par+1;
				//System.out.println("Pares"+par);
			}else {
				System.out.println("Impar");
				impar= impar +1;
			//	System.out.println("Numeros impares"+impar);
			}
			
			
		}
		System.out.println("Pares entre 1 y "+n+": "+par);
		System.out.println("Immpares entre 1 y "+n+": "+impar);
		

	}

}
