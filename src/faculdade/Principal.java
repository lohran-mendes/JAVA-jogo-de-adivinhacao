package faculdade;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int palpite = 0;
		int valorCorreto = 10000;
		String msg;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Advinhe com quantos guerreiros nós iremos lutar!");
		System.out.println("\nQual o seu palpite?");
		palpite = entrada.nextInt();
		
		while(palpite != valorCorreto) {
			msg = palpite < valorCorreto ? "\nUm pouco mais" : "\nUm pouco menos";
			System.out.println(msg);
			System.out.println("\nDigite outro palpite");
			palpite = entrada.nextInt();
		}
		
		System.out.println("Acertou!");
		
	}

}
