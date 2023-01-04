package exer04;

public class funcionario001 {

	public static void main(String[] args) {
		funcionario novoFuncionario = new funcionario("Márcio", "Pessôa", "Dev Back", 10000, "01/07/2022.");
		
		System.out.println("Funcionario: " + novoFuncionario.getNome() + " " + novoFuncionario.getSobrenome());
		System.out.println("Cargo: " + novoFuncionario.getCargo());
		System.out.println("Salario: " + novoFuncionario.getSalario());
		System.out.println("Data de admissão: " + novoFuncionario.getDataContratacao());
	}

}
