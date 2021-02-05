
public class Codiguin{
	public static void main(String[] args) {
		/*Funcoes interessantes para string*/
		/*
			
		*/
		String original = "abce FFF ac a da";
		//Convertendo a string para letras minusculas;
		String s01 = original.toLowerCase();
		//Converte para letras Maiusculas
		String s02 = original.toUpperCase();
		//elimina os espaços no canto
		String s03 = original.trim();
		//pega somente do 2 adiante e forma um novo caractere"
		String s04 = original.substring(2);
		System.out.println("Original:"+original);
		System.out.println("To lower case:"+s01);
		System.out.println("To Upper case:"+s02);
		System.out.println("Trim:"+s03);

		System.out.println("Substring(2)"+s04);
	
	}
}