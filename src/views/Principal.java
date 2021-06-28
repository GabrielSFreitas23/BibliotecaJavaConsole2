package views;

import java.util.Scanner;

import utils.Console;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		int opcao;
		do {
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			System.out.println("----------MENU PRINCIPAL----------");
			System.out.println("1 - Menu Cliente\n"
							 + "2 - Menu Funcionário\n"
							 + "0 - Sair");
			opcao = lerInteiro("\nDigite a opção escolhida: ");
			
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
				System.out.println("\n -- OPÇÃO INVÁLIDA!!! --\n ");
				break;
			}
			
		} while (opcao != 0);
		
	}
	
	public static int lerInteiro(String msg) {
		boolean valorCorreto = false;
		int valor = 0;
		do {
			try {
				System.out.println(msg);
				valor = Integer.parseInt(sc.next());
				valorCorreto = true;
			} catch (NumberFormatException e) {
				System.out.println("\nDigite apenas números");
			} 
		}while(!valorCorreto);
		return valor;
	}
}