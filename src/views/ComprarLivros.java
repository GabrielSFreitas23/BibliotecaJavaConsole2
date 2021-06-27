package views;

import java.util.Date;

import dao.ClienteDAO;
import dao.LivroDAO;
import models.Cliente;
import models.Livro;
import utils.Console;

public class ComprarLivros {

	public static void renderizar() {
		for (Cliente clienteCadastrado : ClienteDAO.retonarClientes()) {
			System.out.println(clienteCadastrado.getCodigo() + "-" + clienteCadastrado.getCpf() + "-"
					+ clienteCadastrado.getNome());

			int codCli = Console.readInt("Digite o código do Cliente: ");

			if (codCli == clienteCadastrado.getCodigo()) {
				
				for (Livro livroCadastrado : LivroDAO.retornarLivros()) {
					System.out.println(livroCadastrado.getCodlivro() + " - " + livroCadastrado.getTitulo());
				}
				
				int codigo = Console.readInt("Digite o código do livro que deseja comprar: ");
				
				System.out.println("Total : R$ 45,00\n");
				int numCartao = Console.readInt("Informe o número do cartão\n");
				int codSeguranca = Console.readInt("Informe o código de segurança\n");
				
				System.out.println("Pagamento realizado com sucesso!!");
				
			} else {
				System.out.println("Cliente não encontrado!");
			}
		}
	}
	
}
