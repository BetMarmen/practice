package contraseña;

import java.util.Scanner;

public class main_contra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		String contra = "12345678";
		int cont=0 ;
		Scanner scan = new Scanner(System.in);
		do {
			
			System.out.println("Ingrese la contraseña:");
			input= scan.nextLine();
			if(input.equals(contra)) {
				System.out.println("Bienvenido!");
				break;
				
			}
			else 
			{
				System.out.println("Vuelva a intentarlo!");
				
				cont++;
				
			}
			if(cont==3) {
				System.out.println("Intentos gastados prix :*[ ");
			}
			
		}
		while(cont!=3);
		

	}

}
