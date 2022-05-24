package lista2APS;

import java.util.Scanner;

/*Uma loja fornece 10% de desconto para funcionários e 5% de desconto para 
clientes vips. Faça um programa que calcule o valor total a ser pago por uma 
pessoa. O programa deverá ler o valor total da compra efetuada e um código que 
identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3).
*/
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		double totalPagar,
		descontoCliente = 1,
		descontoFuncionario = 0.90,
		descontoVIP= 0.95;
		
		System.out.println("Se você for um cliente Comum digite (1)");
		System.out.println("Se você for um funcionário digite (2)");
		System.out.println("Se você for um VIP digite (3)");
		int cliente = dado.nextInt();
		
		System.out.println("Qual o valor total da compra efetuada?");
		double compra = dado.nextDouble();
		
		if (cliente == 1 ) {
			totalPagar = compra * descontoCliente;
			System.out.printf("O cliente devera pagar: %.2f",totalPagar);
		}else if(cliente == 2 ) {
			totalPagar = compra  * descontoFuncionario;
			System.out.printf("O cliente devera pagar: %.2f",totalPagar);
		}else if(cliente == 3) {
			totalPagar = compra * descontoVIP;
			System.out.printf("O cliente devera pagar: %.2f",totalPagar);
		}
		dado.close();
	}
}
