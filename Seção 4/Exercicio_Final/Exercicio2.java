import java.util.Locale;
import java.util.Scanner;



public class Exercicio2{
	public static void main(String[] args) {

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.*/
	Locale.setDefault(Locale.US);
	double raio, pi, area;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o valor do raio.");
	
	raio = sc.nextDouble();
	
	pi =  3.14159;

	/*Fórmula da área: area = π . raio^2*/

	area = pi*Math.pow(raio,2);

	System.out.printf("A=%.4f",area);
/*
//DOUBLE
			double x;
			x = sc.nextDouble();
	//		System.out.println("Voce digitou: "+x);//imprime.
			System.out.printf("Voce digitou: %.2f\n",x);//imprime.
		
			sc.close();//encerra esse recurso que criamos.
*/
sc.close();
	}
}