package exer07;

public class paciente007 {

	public static void main(String[] args) {
		paciente novoPaciente = new paciente("Manoel", 41, "Rua da Esquina", "81-999999999", "Java", "007");
		
		System.out.println("Nome: " + novoPaciente.getNome());
		System.out.println("Idade: " + novoPaciente.getIdade());
		System.out.println("Endereço: " + novoPaciente.getEndereco());
		System.out.println("Telefone: " + novoPaciente.getTelefone());
		System.out.println("Doença: " + novoPaciente.getDoenca());
		System.out.println("Código do Cliente: " + novoPaciente.getCodPaciente());
		
	}

}
