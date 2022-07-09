package ativ_Mod1;

public class SomaVetor {

	public static void main(String[] args) {
		//2) Declarar dois vetores com capacidade para armazenar 
//		10(dez) números inteiros cada um. Declarar um terceiro vetor 
//		que receba a soma dos elementos dos outros dois.
	

		int vetor1[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int vetor2[] = new int[] {10,20,30,40,50,60,70,80,90,100};
		int vetor3[] = new int[10] ;
		int soma = 0;
			
			for(int i = 0; i < vetor1.length; i++) {
				System.out.printf("vetor1[%d] = %d   |  Vetor2[%d] = %d%n", i,vetor1[i], i,vetor2[i]);
			}
			
			System.out.println("\nSoma dos vetores: ");
				for(int i = 0; i < vetor3.length; i++) {
					vetor3[i] = vetor1[i] + vetor2[i];
						System.out.printf("vetor3[%d] = %d%n",i, vetor3[i]);

	}

}
}