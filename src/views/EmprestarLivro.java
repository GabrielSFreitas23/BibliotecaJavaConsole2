package views;

import dao.LivroDAO;
import models.Livro;
import utils.Console;
import java.time.LocalDate;


public class EmprestarLivro {
	
	public static void renderizar() {
		
		for(Livro livroCadastrado : LivroDAO.retornarLivros()) {
			System.out.println(livroCadastrado.getCodlivro() + " - " + livroCadastrado.getTitulo());
		}
		
		
		int emprestar = Console.readInt("Digite o c�digo do livro que deseja emprestar: ");
		for(Livro livroCadastrado : LivroDAO.retornarLivros()) {
			if(emprestar == livroCadastrado.getCodlivro()) {
				
				if(!livroCadastrado.getEmprestado()) {
					livroCadastrado.setEmprestado(true);
					System.out.println("Livro emprestado! em: "+LocalDate.now());
				} else {
					System.out.println("Livro indispon�vel!");
				}
				
			}else {
				System.out.println("Livro n�o encontrado!");
			}
		}
	}

}
