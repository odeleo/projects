package ativ_Mod1;

import java.util.Locale;
import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
//		Criar um vetor que receba tr�s notas de um aluno, calcule a sua m�dia e verificar a situa��o do aluno.  
//		A m�dia de 7 at� 10 o aluno est� APROVADO.A m�dia de 3 at� 6.9 o aluno vai para RECUPERA��O e 
//		a m�dia menor do que 3 o aluno est� REPROVADO.

		
		Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double soma = 0;

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
                System.out.printf("Digite a %d� nota:", i + 1);
                notas[i] = input.nextDouble();
                soma = (soma + notas[i]);

        }
        double media = soma / 3;

        System.out.printf("A media do aluno �: %.2f%n", media);

        if (media >= 7) {
                System.out.println("O aluno foi aprovado!");

        } else if (media >= 3) {
                System.out.println("O aluno est� de recuperacao!");

        } else {
                System.out.println("O aluno est� reprovado!");
        }
        input.close();
	}

}
