package aplication;

import java.util.Locale;

import entitie.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario func1 = new Funcionario("Joao", "Silva", 2500.00);
		Funcionario func2 = new Funcionario("Maria", "Oliveira", 6000.00);
		
		func1.darAumento(2500.00);
		func2.darAumento(6000.00);
		
		Funcionario.contabilizarFunc();
	}

}
