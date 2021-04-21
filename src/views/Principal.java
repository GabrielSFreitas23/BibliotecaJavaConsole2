package views;

import utils.Console;

public class Principal {

	public static void main(String[] args) {
		
		
		
		int opcao;
		do {
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			System.out.println("----------MENU PRINCIPAL----------");
			System.out.println("1 - Menu Cliente\n"
							 + "2 - Menu Funcion�rio\n"
							 + "0 - Sair");
			opcao = Console.readInt("\nDigite a op��o escolhida: ");
			
			switch (opcao) {
			case 1:	
				MenuCliente.renderizar();
				break;
			case 2:
				MenuFuncionario.renderizar();
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\n -- OP��O INV�LIDA!!! --\n ");
				break;
			}
			
		} while (opcao != 0);
		
	}
}