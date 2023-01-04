package exer04;

/*Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class funcionario {
	private String nome;
	private String sobrenome;
	private String cargo;
	private double salario;
	private String dataContratacao;
	
	public funcionario(String nome, String sobrenome, String cargo, double salario, String dataContratacao) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cargo = cargo;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	
	
}
