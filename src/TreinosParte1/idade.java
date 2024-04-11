package TreinosParte1;

import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
		int anoNasci = entrada.nextInt();
		int idade = anoAtual - anoNasci;
		System.out.println("Sua idade é " + idade);
		entrada.close();
		
		
		
	}

}
