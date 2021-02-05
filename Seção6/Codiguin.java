import java.util.Scanner;
public class Codiguin{
	public static void main(String[] args) {
		/*
		for(inicio;condição;incremento){
			comando1
			comando2	
		}
		

		*/
		Scanner sc = new Scanner(System.in);
		int soma=0,N=5;

		for(int i=0;i<N;i++){
			int x = sc.nextInt();
			soma+=x;
		}
		

		System.out.println("Somatorio:"+soma);
	}
}