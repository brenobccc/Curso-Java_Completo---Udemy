import java.util.Scanner;
public class Funcoes{

	public static void main(String[] args) {
		//FUNCOES
	  /*double y = 25.0;
		double x = Math.sqrt(y);
		System.out.println(x);*/

	//IMPORTANTE
	/*Em POO, as ~funções em classes recebem o nome de métodos*/

		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a,b,c);

		showResult(higher);
		sc.close();
	}


	public static int max(int x,int y, int z){
		int aux;
		//logica
		if(x>y && y>z)
			aux = x;
		else if(y>z)
			aux = y;
		else
			aux = z;
		return aux;
	}

	public static void showResult(int value){
		System.out.println("higher = "+value);
	}
}