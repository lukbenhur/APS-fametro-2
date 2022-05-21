package lista2APS;

import java.util.Scanner;

/*
 * 1. Uma revendedora de carros usados paga a seus funcionários vendedores um 
	salário fixo por mês, mais uma comissão também fixa para cada carro vendido e 
	mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia 
	o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo 
	e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do 
	vendedor
	*/
public class Exercicio1 {
	public static void main(String[] args) {
		final double COMISSAO_VALOR_CARRO = 0.05;
		double valorTotalVenda = 0,valorVenda,comissaoVenda,salarioFinal;
		String salarioFixoEntrada;
		Scanner data = new Scanner(System.in);
		
		System.out.println("Bem vindo à LocaleCar");
		System.out.println("Quantos carros foram vendidos pelo colaborador?");
		int vendas = data.nextInt();
		
		int count = 1;
		while(count <= vendas) {
			System.out.printf("Qual o valor da %d venda",count);
			valorVenda = data.nextDouble();
			valorTotalVenda += valorVenda;
			count++;
		}
		
		System.out.println("Qual o valor do salario base do colaborador");
		salarioFixoEntrada = data.next();
		
		double salarioFixo = Double.parseDouble(salarioFixoEntrada.replace(",","."));
		
		
		System.out.println("Qual a comissao do funcionario por venda?");
		comissaoVenda = data.nextDouble();
		comissaoVenda = comissaoVenda / 100;
		
		
		
		salarioFinal = salarioFixo + (comissaoVenda * vendas) + (COMISSAO_VALOR_CARRO * valorTotalVenda);
		System.out.println("O salario final recebido pelo funcionário é de: " + salarioFinal);
		data.close();
	}
}
