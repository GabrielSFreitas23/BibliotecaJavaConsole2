package views;

import java.util.Scanner;

import dao.LivroDAO;
import models.Livro;
import utils.Console;

public class MenuCliente {
	
	private static Scanner sc = new Scanner(System.in);

	public static void renderizar() {

		int opcao;
		do {
			System.out.println("\n ---------- MENU CLIENTE ---------- \n");
			System.out.println("1 - Acervo");
			System.out.println("2 - Emprestar Livro");
			System.out.println("3 - Buscar um Livro");
			System.out.println("4 - Comprar um Livro");
			System.out.println("5 - Vender um Livro");
			System.out.println("0 - Voltar para menu principal");
			opcao = lerInteiro("\nDigite uma opção: ");

			switch (opcao) {
			case 1:
				Acervo.renderizar();
				break;
			case 2:
				EmprestarLivro.renderizar();
				break;
			case 3:
				String buscar = Console.readString("Buscar livro por título: ");
				for (Livro livroCadastrado : LivroDAO.retornarLivros()) {
					if (buscar.equals(livroCadastrado.getTitulo())) {
						System.out.println("\nLivro encontrado! ");
						System.out.println(livroCadastrado);
					} else {
						System.out.println("\nLivro não encontrado! ");
					}
				}
	
				break;
			case 4:
				ComprarLivros.renderizar();
				break;
			case 5:
				VenderLivros.renderizar();
				break;
			case 0:
				System.out.println("\nRetornando ao menu principal");
				break;
			default:
				System.out.println("\n -- OPÇÃO INVÁLIDA ! -- \n");
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
