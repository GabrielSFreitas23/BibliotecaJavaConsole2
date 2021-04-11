package views;

import utils.Console;

public class Principal {

	public static void main(String[] args) {
		
		
		
		int opcao;
		do {
			System.out.println("\n ----------- MENU PRINCIPAL -----------\n ");
			System.out.println("1 - Menu Cliente");
			System.out.println("2 - Menu Funcion�rio");
			System.out.println("8 - Listar empr�stimos");
			System.out.println("0 - Sair");
			opcao = Console.readInt("\nDigite a op��o escolhida: ");
			
			switch (opcao) {
			case 1:	
				MenuCliente.renderizar();
				break;
			case 2:
				MenuFuncionario.renderizar();
				break;
			case 9:
				MenuCliente.renderizar();
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