//Que son els vectors/array?
//Un vector és una manera d'emmagatzemar varios valors de variables.
import java.util.Scanner;
public class vectors {

	public static void main(String[]args){
		int resposta;
		int resposta2;
		//Es declaren així
		//"En cas de ser de tipus int; també pot ser double, char...
		int[] vec = new int[5];
		//El de dalt és un array amb lloc per cinc valors al que hem anomenat vec
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			System.out.println("Introdueix un nombre per a definir la cel·la "+i+" del vector.");
			vec[i] = s.nextInt();
		}
		Scanner r = new Scanner (System.in);
		Scanner e = new Scanner (System.in);
		System.out.println("Què vols fer ara?");
		System.out.println("1. Imprimeix TOTS els nombres introduits, a la pantalla.");
		System.out.println("2. Imprimeix els tres primers valor donats.");
		System.out.println("3. Acaba el programa.");
		resposta = e.nextInt();
		while(resposta > 3 || resposta < 1){
			System.out.println("Introdueix una opció correcta (1, 2 o 3.)");
			System.out.println("Què vols fer ara?");
			System.out.println("1. Imprimeix TOTS els nombres introduits, a la pantalla.");
			System.out.println("2. Imprimeix els tres primers valors donats.");
			System.out.println("3. Acaba el programa.");
			resposta = e.nextInt();
			
		}
		
		switch (resposta){
			case 1:
				for(int i = 0; i < 5; i++){
				System.out.print(vec[i]+", ");
				}
				break;
			case 2:
				for(int i = 0; i < 3; i++){
					System.out.print(vec[i]+", ");
				}
				break;
			case 3:
				System.out.println("Ja pots tancar el programa.");
				break;
		}
		/*System.out.println("Vols  ressetejar el programa?");
		System.out.println("1. SI.");
		System.out.println("2. NO.");
		resposta2 = e.nextInt();
		switch (resposta2){
			case 1:
				
		}*/
	}
}
