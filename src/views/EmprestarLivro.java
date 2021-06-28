package views;

import dao.ClienteDAO;
import dao.LivroDAO;
import models.Cliente;
import models.Livro;
import utils.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class EmprestarLivro {

	private static Date mesAtual;
	private static Date mesDevolucao;

	public static void renderizar() {

		for (Cliente clienteCadastrado : ClienteDAO.retonarClientes()) {
			System.out.println(clienteCadastrado.getCodigo() + "-" + clienteCadastrado.getCpf() + "-"
					+ clienteCadastrado.getNome());

			int codCli = Console.readInt("Digite o código do Cliente: ");

			if (codCli == clienteCadastrado.getCodigo()) {
				
				try {
					if(mesAtual.getMonth() > mesDevolucao.getMonth()) {
						clienteCadastrado.setMulta(true);
					}
				} catch (Exception e) {
					System.out.println("\n");
				}

				if(clienteCadastrado.getMulta() == false) {
					for (Livro livroCadastrado : LivroDAO.retornarLivros()) {
						System.out.println(livroCadastrado.getCodlivro() + " - " + livroCadastrado.getTitulo());
					}

					int emprestar = Console.readInt("Digite o código do livro que deseja emprestar: ");
					for (Livro livroCadastrado : LivroDAO.retornarLivros()) {
						if (emprestar == livroCadastrado.getCodlivro()) {

							if (!livroCadastrado.getEmprestado()) {
								livroCadastrado.setEmprestado(true);
								mesAtual = new Date();
								mesDevolucao = new Date();
								mesDevolucao.setMonth(mesAtual.getMonth() + 30);
								System.out.println("A devolucao devera ser realizada ate: /n" + mesDevolucao.getMonth());

							} else {

								System.out.println("Livro indisponível!");
							}

						} else {
							System.out.println("Livro não encontrado!");
						}
					}
				} else {
					System.out.println("--------------------------------------------------------------\n"
									 + "Você não pode realizar empréstimo pois possui multas pendentes\n"
									 + "--------------------------------------------------------------\n");
					
				}
				
			}
		}
	}

}