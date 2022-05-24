package lista2APS;

import java.util.Scanner;

/*
 	Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima 
	em estoque e quantidade mínima em estoque de um produto. Calcular e 
	escrever a quantidade média ((quantidade média = quantidade máxima + 
	quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a 
	quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a 
	mensagem 'Efetuar compra'
  
 */
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double estoqueInicial,estoqueMax,estoqueMin,media;
		
		System.out.println("qual a quantidade de estoque?");
		estoqueInicial = dado.nextDouble();
		System.out.println("qual a quantidade máxima de estoque?");
		estoqueMax = dado.nextDouble();
		System.out.println("qual a quantidade mínima de estoque?");
		estoqueMin = dado.nextDouble();
		
		media = (estoqueMax + estoqueMin) / 2;
		
		if(estoqueInicial >= media) {
			System.out.println("não efetue a compra!");
			System.out.printf("A quantidade média do estoque é %.2f",media);
		}else {
			System.out.println("Efetuar a compra!");
			System.out.printf("A quantidade média do estoque é %.2f",media);
		}
		dado.close();
	}
}
