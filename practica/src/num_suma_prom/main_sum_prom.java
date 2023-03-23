package num_suma_prom;

import java.util.Scanner;

public class main_sum_prom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n,input,suma = 0;
		float prom;
		System.out.println("¿cuantos numeros desea ingresar?");
		n = scan.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("ingrese el numero :");
			input = scan.nextInt();
			suma= suma+input;
			
			
		}
		prom = (float)suma/n;
		System.out.println("Suma de los numeros"+suma);
		System.out.println("promedio"+prom);
	}

}
