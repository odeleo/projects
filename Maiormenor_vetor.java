package ativ_Mod1;

import java.util.Scanner;

public class Maiormenor_vetor {

	public static void main(String[] args) {
		//3) Declarar um vetor de inteiros, solicitar ao usuário 
		//para definir o tamanho e os elementos do vetor e imprimir o maior e menor valor do vetor.
		Scanner input = new Scanner(System.in);
	       int tam;
	       int i, menor, maior, soma = 0;
	    
	    System.out.println("Informe o tamanho do vetor: ");
	        tam = input.nextInt();

	    int vetor[] = new int[tam]; 
	    
	    for (i = 0; i < tam; i++) {
	      System.out.printf("Informe o valor para vetor[%d]", i);
	      vetor[i] = input.nextInt();
	      
	    }
	    menor = vetor[0]; 
	    maior = vetor[0];
	    
	    for (i = 0; i < tam; i++) {
	        if (vetor[i] < menor) {
	         menor = vetor[i];
	      }
	      else if(vetor[i] > maior) {
	         maior = vetor[i];
	      }
	    }
	    
	    System.out.println("\nMenor Valor: " + menor);
	    System.out.print("Maior Valor: " + maior);
	    
	    
		// Ordenando em ordem crescente para encontrar o maior e menor valor:

//		Arrays.sort(vetor); // ordenar em ordem crescente
	//	
//		System.out.print("\nVetor ordenado: ");
//		for (i = 0; i < tam; i++) {
//			System.out.print(vetor[i] + " ");
//		}
	//
//		menor = vetor[0];
//		maior = vetor[tam - 1];
	//	
//		System.out.println();
//		System.out.println("Menor Valor: " + menor);
//		System.out.print("Maior Valor: " + maior);
	//	
//		 System.out.printf("\nSoma dos valores do vetor: %d\n", soma);
	    input.close();

	}

}
