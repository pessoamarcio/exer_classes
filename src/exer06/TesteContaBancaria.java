package exer06;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria novaConta = new ContaBancaria(200, 6534, 2, "Maria", 1200f);
				
		System.out.println("Numero da Conta  "+ novaConta.getNumero());
		System.out.println("Numero da Agencia "+ novaConta.getAgencia());
		System.out.println("Tipo de conta "+ novaConta.getTipo());
		System.out.println("Nome do titular "+ novaConta.getTitular());
		System.out.println("Saldo total da conta "+ novaConta.getSaldo());
		
		novaConta.sacar(22);
	
	}

}

