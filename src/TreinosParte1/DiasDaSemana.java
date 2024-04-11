package TreinosParte1;

import java.util.Scanner;

public class DiasDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int diaSema = 0;
		System.out.println("digite um numero de 1 a 7: ");
		diaSema = entrada.nextInt();
		switch (diaSema) {

		case 1:
			System.out.println("Domingo e o dia de hoje");
			break;
		case 2:
			System.out.println("Segunda-feira e o dia de hoje");
			break;
		case 3:
			System.out.println("Terça-feira e o dia de hoje");
			break;
		case 4:
			System.out.println("Quarta-feira e o dia de hoje");
			break;
		case 5:
			System.out.println("Quinta-feira e o dia de hoje");
			break;
		case 6:
			System.out.println("Sexta-feira e o dia de hoje");
			break;
		case 7:
			break;
		default:
			System.out.println("numero invalido!!!");
			break;
		}
		System.out.println("Fim");

		entrada.close();

	}
}
