package sum_pares;

public class main_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		long suma=0;
		for (int i = 20 ; i<=100; i++) {
			if(i%2!=0) {
				System.out.println(i);
				cont +=1;
				suma= suma+i;
			}
			
		}
		System.out.println("Cantidad de numeros impares: "+cont);
		System.out.println("suma: "+suma);
	}
	

}
