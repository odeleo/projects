package ativ_Mod1;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		System.out.println("Escolha um c�digo para exibir o dia: ");
		System.err.println("+==========================+");
		System.err.println("| 1 - Domingo | 5 - Quinta |");
		System.err.println("| 2 - Segunda | 6 - Sexta  |");
		System.err.println("| 3 - Ter�a   | 7 - S�bado |");
		System.err.println("| 4 - Quarta  | 0 - Sair   |");
		System.err.println("+==========================+");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String dia = "";
		
		while(num != 0) {
			
			switch(num) {
			
				case 1:
					dia = "Domingo"; //System.out.println("Domingo");
					break;
				case 2:
					dia = "Segunda-feira";
					break;
				case 3:
					dia = "Ter�a-feira";
					break;
				case 4:
					dia = "Quarta-feira";
					break;
				case 5:
					dia = "Quinta-feira";
					break;
				case 6:
					dia = "Sexta-feira";
					break;
				case 7:
					dia = "S�bado";
					break;
				default:
					dia = "C�digo inv�lido!! - Digite novamente: ";
					break;
		}
		System.out.println(dia);
		num = sc.nextInt();
		}
		System.out.println("Fim do Programa.");
		
		sc.close();

	}

}
