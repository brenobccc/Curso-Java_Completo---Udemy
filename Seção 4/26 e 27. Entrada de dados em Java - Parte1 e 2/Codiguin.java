import java.util.Locale;
import java.util.Scanner;

//  PARTE 1 do video

//public class Codiguin{
//	public static void main(String[] args) {
		//Entrada de Dados em Java.
		/*Criar um objeto do tipo scanner*/
		//associo o objeto scanner a entrada do teclado.
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		*/
		/*
		//STRING
			String x;
			x = sc.next();//permite que eu digite uma palavra a armazene nessa variavel.
		*/

		/*	
		//INTEIRO
			int x;
			x = sc.nextInt();
		*/

		/*
		//DOUBLE
			double x;
			x = sc.nextDouble();
	//		System.out.println("Voce digitou: "+x);//imprime.
			System.out.printf("Voce digitou: %.2f\n",x);//imprime.
		
			sc.close();//encerra esse recurso que criamos.
		*/
		//CARACTERE
		/*
			char x;
			x = sc.next().charAt(0);
			//System.out.println("Voce digitou: "+x);//imprime.
			System.out.println("Voce digitou: "+x);//imprime.
			
			sc.close();//encerra esse recurso que criamos.
		*/


		//LER VARIOS DADOS NA MESMA LINHA
		/*	
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);*/

		
		/*
	}
}
*/

//	_______________________________
//
//			PARTE 2
//	_______________________________
//Como ler até a quebra de linha.

public class Codiguin{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1,s2,s3;
		//ler até o quebra de linha
		/*Se for apenas um next, irá ler só uma palavra.*/
		int x;
		x = sc.nextInt();
		//limpar o buffer de leitura.
		sc.nextLine();//para consumir a quebra de linha pendente
		s1 = sc.nextIntLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
