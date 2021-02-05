
import java.util.Locale;
import java.util.Scanner;
public class Exercicio4{
	public static void main(String[] args) {
	/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.


	*/	

	int num_funcionario, horas_trabalhadas;
	double valor_hora; 
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	num_funcionario = sc.nextInt();
	horas_trabalhadas = sc.nextInt();
	valor_hora = sc.nextDouble();
	double salario_funcionario;
	salario_funcionario = horas_trabalhadas*valor_hora;
	System.out.printf("NUMBER = %d\nSALARY = %.2f",num_funcionario,salario_funcionario);
	sc.close();
	}
}