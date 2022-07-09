package ativ_Mod1;

public class SomandoVetores {

	public static void main(String[] args) {
		//1) Declarar um vetor com capacidade para armazenar 
		//10(dez) números inteiros. Somar os elementos do vetor e mostrar o resultado.

	
        int vetor[] = new int[] {1,2,3,4,5,6,7,8,9,10};
	        
        int soma = 0;
	       
        for (int i = 0; i < vetor.length; i++) {
        	soma = soma + vetor[i];
        		System.out.print(vetor[i] + " ");
	        }
	     
	       System.out.println("\nSoma dos elementos do Vetor = " + soma);

	}

}
