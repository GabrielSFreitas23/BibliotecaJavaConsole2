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

			int codCli = Console.readInt("Digite o c�digo do Cliente: ");

			if (codCli == clienteCadastrado.getCodigo()) {
				
				for (Livro livroCadastrado : LivroDAO.retornarLivros()) {
					System.out.println(livroCadastrado.getCodlivro() + " - " + livroCadastrado.getTitulo());
				}
				
				int codigo = Console.readInt("Digite o c�digo do livro que deseja comprar: ");
				
				System.out.println("Total : R$ 45,00\n");
				int numCartao = Console.readInt("Informe o n�mero do cart�o\n");
				int codSeguranca = Console.readInt("Informe o c�digo de seguran�a\n");
				
				System.out.println("Pagamento realizado com sucesso!!");
				
			} else {
				System.out.println("Cliente n�o encontrado!");
			}
		}
	}
	
}
