package lista2APS;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere 
	que as idades dos homens serão sempre diferentes entre si, bem como as das 
	mulheres). Calcule e escreva a soma das idades do homem mais velho com a 
	mulher mais nova, e o produto das idades do homem mais novo com a mulher 
	mais velha.
 * 
 */
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int idadeMulher1,idadeMulher2,idadeHomem1,idadeHomem2,homemVelho,mulherVelha,homemNovo,mulherNova;
		double somaIdade,prodIdade;
		
		System.out.println("Qual a idade da primeira mulher");
		idadeMulher1 = dado.nextInt();
		System.out.println("Qual a idade da segunda mulher");
		idadeMulher2 = dado.nextInt();
		
		if(idadeMulher1 == idadeMulher2) {
			System.out.println("Digite idades distintas");
			System.out.println("Qual a idade da segunda mulher");
			idadeMulher2 = dado.nextInt();
		}
		
		System.out.println("Qual a idade do primeiro homem");
		idadeHomem1 = dado.nextInt();
		System.out.println("Qual a idade do segundo homem");
		idadeHomem2 = dado.nextInt();
		
		if(idadeHomem1 == idadeHomem2) {
			System.out.println("Digite idades distintas");
			System.out.println("Qual a idade da segunda mulher");
			idadeMulher2 = dado.nextInt();
		}
		
		if(idadeHomem1 > idadeHomem2) {
			homemVelho = idadeHomem1;
			homemNovo = idadeHomem2;	
		}else {
			homemVelho = idadeHomem2;
			homemNovo = idadeHomem1;
		}
		if(idadeMulher1 > idadeMulher2) {
			mulherVelha = idadeMulher1;
			mulherNova = idadeMulher2;	
		}else {
			mulherVelha = idadeMulher2;
			mulherNova = idadeMulher1;
		}
		
		somaIdade = homemVelho + mulherNova;
		
		prodIdade = homemNovo * mulherVelha;
		System.out.println(prodIdade);
		System.out.println(somaIdade);
		dado.close();
	}
}
