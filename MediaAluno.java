package ativ_Mod1;

import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a nota: ");
	    double nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota: ");
		double nota3 = sc.nextDouble();
		
		
		double media = (nota1+nota2+nota3)/3;
		
		
		System.out.printf("A media é: %.2f%n", media);
		
		
		if (media >=7) {
			System.out.println("Parabéns você foi aprovado!\n" + "Aluno: "+ nome);
			
		}else
			if(media >3) {
				System.out.println("Você está em recuperação!\n" + "Aluno: "+nome);
		
		}else {
				System.out.println("Você foi reprovado!\n");
		}
		
		
		
		
		
	}

}
