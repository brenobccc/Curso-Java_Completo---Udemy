//Para escrever na tela um texto qualquer:

//Sem quebra de linha ao final.
//System.out.print("Bom Dia!");
//Com quebra de linha ao final.
//System.out.println("Bom Dia!");

//importando a classe.
import java.util.Locale;


public class Codiguin{
	public static void main(String[] args) {
		int y = 32;
		double x= 10.35784;

		System.out.print("Ola Mundo! ");//sem quebra de linha
		System.out.println("Bom Dia!");//com quebra de linha
	
		System.out.println(y);

		System.out.println(x);
		//controlando a qtde de casas decimais.
		//printf: imprime algo formatado
		// \n ou %n: quebra de linha.
		System.out.printf("%.2f%n",x);
		/*
			Ele(printf) está pegando o separador da lingua portuguesa.
			então tenho que configurar para o do EUA.
		*/
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n",x);
		
		/*Contatenação*/
		//Regra geral para print e println.
		//println
		System.out.println("RESULTADO = " + x + " METROS");
		//printf
		System.out.printf("RESULTADO = %.2f metros%n", x);

		//concatena varios elementos.
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		//EXERCICIO.	
	}
}