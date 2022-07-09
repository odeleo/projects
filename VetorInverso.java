package ativ_Mod1;

import java.util.Scanner;

public class VetorInverso {

	public static void main(String[] args) {
		//5) Criar um vetor que receba 10 (dez) números. 
		//Imprima o vetor na ordem que foram digitados e na ordem inversa.
	
	
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("Digite o tamanho do vetor: ");
		int tam = input.nextInt();
		
		int[] vetor = new int[tam];
		
		for(i = 0; i < vetor.length; i++) {
			System.out.printf("Informe o valor para vetor[%d] = ", i);
			int num = input.nextInt();
			vetor[i] = num;
		}
		System.out.println("\nVetor na ordem que foi digitado:");
		for(i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("\n\nVetor na ordem inversa: ");
		for(i = vetor.length - 1; i >=0; i--) {
			System.out.print(vetor[i] + " ");
	
	
		}

	}
}
