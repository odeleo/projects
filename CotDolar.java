package ativ_Mod1;

import java.util.Locale;
import java.util.Scanner;

public class CotDolar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double cotDolar, valDolar, valReal;
		
		System.out.print("Cotacao do dolar: \n\n");
		
		System.out.print("Digite o dolar: ");
		cotDolar = entrada.nextDouble();
		
		System.out.print("Digite valor em dolares: ");
		valDolar = entrada.nextDouble();
		
		valReal = cotDolar*valDolar;
		
		System.out.println("Valor em reais: "+valReal+"\n");
		
		
		
		entrada.close();
	

	}

}
