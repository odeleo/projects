package ativ_Mod1;

import java.util.Locale;
import java.util.Scanner;

public class CalcIdade {

	public static void main(String[] args) {
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos
//meses e dias e mostre-a expressa em dias. 
//Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
		
		int anos, mes, dias;
		int idadeEmDias;
		
		System.out.println("Digite a idade em anos: ");
		anos = sc.nextInt();
		
		System.out.println("Digite a idade em meses: ");
		mes = sc.nextInt();
		
		System.out.println("Digite a idade em dias: ");
		dias = sc.nextInt();
		
		idadeEmDias = anos*365 + mes*30 + dias;
		System.out.println("Idade em dias é: "+ idadeEmDias);
		
		
		
		
		
		
		
	}

}
