import java.util.Scanner;

public class Exercicio4{
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>y || (x==0 && y==0)){
			System.out.println("O JOGO DUROU "+((y+24)-x)+" HORA(S)");
		}else{
			System.out.println("O JOGO DUROU "+(y-x)+" HORA(S)");
		}
		sc.close();
	}
}