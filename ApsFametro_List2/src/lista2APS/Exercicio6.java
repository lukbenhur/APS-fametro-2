package lista2APS;

import java.util.Scanner;

/*
Faça um algoritmo para ler: a descrição do produto (nome), a quantidade 
adquirida e o preço unitário. Calcular e escrever o total (total = quantidade 
adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total -
desconto)
quantidade <=5 desconto de 2%
quantidade > 5 e <= 10 desconto 3%
quantidade > 10 desconto 5%
	 */
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		String nome,convert;
		int quantidade;
		double precoProduto,total,totalPagar,desconto;
		
		System.out.println("Qual o nome do produto?");
		nome = dado.next();
		System.out.printf("Quantas unidades do/da %s foi comprada%n", nome);
		quantidade = dado.nextInt();
		
		System.out.println("Qual o valor de cada unidade comprada do produto?");
		convert = dado.next(); //caso o usuario entre com valor usando separador decimal errado;;
		precoProduto = Double.parseDouble(convert.replace(",", ".")); 
		/*
		 * o divisor decimal é o ponto(sistema ingles) caso eu entre com um numero separado por virgula , nao irei conseguir converter
		 * pois numero separado por virgula e uma string e nao e possivel converter para double, por isso uso o replace para trocar sempre a virgula
		 * por ponto antes de usar o metodo parseDouble
		 */
		
		total = quantidade * precoProduto;
		totalPagar = 0;
		if(quantidade <= 5) {
			desconto = 0.98;
			totalPagar = total * desconto;
			System.out.printf("A compra total deu : %.2f%n",total);
			System.out.printf("A compra após os descontos deu : %.2f",totalPagar);
		}else if(quantidade > 5 && quantidade <= 10) {
			desconto = 0.97;
			totalPagar = total * desconto;
			System.out.printf("A compra total deu : %.2f%n",total);
			System.out.printf("A compra após os descontos deu : %.2f",totalPagar);
		}else {
			desconto = 0.95;
			totalPagar = total * desconto;
			System.out.printf("A compra total deu : %.2f%n",total);
			System.out.printf("A compra após os descontos deu : %.2f",totalPagar);
		}
		dado.close();
	}
}
