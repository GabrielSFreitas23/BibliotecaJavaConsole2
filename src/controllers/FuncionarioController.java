package controllers;

import dao.FuncionarioDAO;
import models.Funcionario;
import utils.Validacao;

public class FuncionarioController {

	// Cadastrar e listar Funcion�rio
	
	public static void cadastrar(Funcionario f) {
		if (Validacao.validarCpf(f.getCpf())) {
			if (FuncionarioDAO.cadastrarFuncionario(f)) {
				System.out.println("\nFUNCION�RIO CADASTRADO!!!\n");
			} else {
				System.out.println("\nESSE FUNCION�RIO J� EXISTE!!!\n");
			}
		}else {
			System.out.println("\nCPF inv�lido!");
		}
	}
	
}
