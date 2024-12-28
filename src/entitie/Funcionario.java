package entitie;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private Double salario;
	
	private static Integer countFunc = 0;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, String sobrenome, Double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		countFunc++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void darAumento(Double salario) {
		double aumento;
		double salAumento;
		double salAnual;
		aumento = salario * 0.10;
		salAumento = salario + aumento;
		salAnual = salAumento * 12;
		
		System.out.printf("Salario anual = R$ %.2f%n", salAnual);
		
	}
	
	public static void contabilizarFunc() {
		System.out.println("Quantidade de funcionários: "+ countFunc);
	}
}
