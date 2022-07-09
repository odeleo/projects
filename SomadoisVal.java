package ativ_Mod1;

import java.util.Scanner;

public class SomadoisVal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//		Some o valor de dois números
		
		
		String nome;
		int valor1, valor2;
		
		System.out.println("Digite o seu nome: ");
		nome = input.nextLine();
		
		System.out.println("Digite o valor: ");
		valor1 = input.nextInt();
		
		System.out.println("Digite o valor: ");
		valor2 = input.nextInt();
		
		System.out.printf("A soma é: %d ", (valor1+valor2));
		
		
		
		
		
		
		

	}

}
