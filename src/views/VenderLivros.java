package views;

import controllers.ClienteController;
import dao.ClienteDAO;
import dao.LivroDAO;
import models.Cliente;
import models.Livro;
import utils.Console;

public class VenderLivros {

	private static Livro l;
	
	public static void renderizar() {
		for (Cliente clienteCadastrado : ClienteDAO.retonarClientes()) {
			System.out.println(clienteCadastrado.getCodigo() + "-" + clienteCadastrado.getCpf() + "-"
					+ clienteCadastrado.getNome());

			int codCli = Console.readInt("Digite o código do Cliente: ");

			if (codCli == clienteCadastrado.getCodigo()) {
				

				
				System.out.println("\n -- CADASTRAR LIVRO --\n");
				l = new Livro();
				l.setCodlivro(Console.readInt("Informe o Código: "));
				l.setTitulo(Console.readString("Informe o Título: "));
				l.setEditora(Console.readString("Informe a Editora: "));
				l.setAutor(Console.readString("Informe o Autor: "));
				l.setAssunto(Console.readString("Informe o Assunto: "));
				l.setIdioma(Console.readString("Informe o Idioma: "));
				int codSeguranca = Console.readInt("Informe o número da agência\n");
				int numCartao = Console.readInt("Informe o número da conta\n");
				l.setEmprestado(false);
				
				if(LivroDAO.cadastrarLivro(l)) {
					System.out.println("\n -- LIVRO VENDIDO POR R$ 35,00 -- \n");
				}else {
					System.out.println("\n -- LIVRO JA EXISTE -- \n");
				}

				
				
				
				System.out.println("Pagamento realizado com sucesso!!");
				
			} else {
				System.out.println("Cliente não encontrado!");
			}
		}
	}
	
}
