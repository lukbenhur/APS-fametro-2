package lista2APS;

import java.util.Scanner;

/*
 * Faça um programa de conversão de base numérica. O programa deverá 
apresentar uma tela de entrada com as seguintes opções:
< Conversão de base >
1: decimal para hexadecimal
2: hexadecimal para decimal
3: decimal para octal
4: octal para decimal
Lembre que, você deve informar as opções para que a partir da opção escolhida, o 
programa deva pedir o número na base escolhida, lê-lo e apresentá-lo na base 
desejada.
 */
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int  numero;
		String resultado;
		
		System.out.println("CONVERSÃO DE BASE");
		System.out.println("< Conversão de base >");
		System.out.println("1: decimal para hexadecimal");
		System.out.println("2: hexadecimal para decimal");
		System.out.println("3: decimal para octal");
		System.out.println("4: octal para decimal");
		System.out.println("--------------------------------------");
		
		System.out.println("QUAL INTEM DE CIMA VOÇÊ DESEJA :");
		int opcao = dado.nextInt();
		
		System.out.println("Qual número você deseja converter");
		String valor = dado.next();

		switch (opcao) {

		case 1: {
			numero = Integer.parseInt(valor);
			resultado = Integer.toHexString(numero);
			System.out.println(resultado.toUpperCase());
			break;
		}

		case 2: {
			numero = Integer.parseInt(valor, 16);
			resultado = Integer.toString(numero);// codigo morto
			System.out.println(resultado);
			break;
		}
		case 3: {
			numero = Integer.parseInt(valor);
			resultado = Integer.toOctalString(numero);
			System.out.println(resultado);
		}
		case 4: {
			numero = Integer.parseInt(valor,8);
			System.out.println(numero);
			break;
		}
		
	}
		dado.close();
}
}