package ativ_Mod1;

import java.util.Locale;
import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
//		Criar um vetor que receba três notas de um aluno, calcule a sua média e verificar a situação do aluno.  
//		A média de 7 até 10 o aluno está APROVADO.A média de 3 até 6.9 o aluno vai para RECUPERAÇÃO e 
//		a média menor do que 3 o aluno está REPROVADO.

		
		Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double soma = 0;

        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
                System.out.printf("Digite a %dª nota:", i + 1);
                notas[i] = input.nextDouble();
                soma = (soma + notas[i]);

        }
        double media = soma / 3;

        System.out.printf("A media do aluno é: %.2f%n", media);

        if (media >= 7) {
                System.out.println("O aluno foi aprovado!");

        } else if (media >= 3) {
                System.out.println("O aluno está de recuperacao!");

        } else {
                System.out.println("O aluno está reprovado!");
        }
        input.close();
	}

}
