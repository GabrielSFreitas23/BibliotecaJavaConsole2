package views;
import controllers.FuncionarioController;
//import dao.FuncionarioDAO;
//import models.Funcionario;

public class ListarFuncionarios {	
	
	public static void renderizar() {
		System.out.println("\n -- LISTAR FUNCION�RIOS --\n ");	
		
		FuncionarioController.listar();
	}
}
