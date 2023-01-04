package exer01;

import exer06.ContaBancaria;

public class cliente1 {
	
	public static void main(String[] args){
		
		cliente novoCliente = new cliente("Marcio", "Rua Maranhão", "(81)999999999", 38);
		
		System.out.println("Nome: " + novoCliente.getNome());
		System.out.println("Endereço: " + novoCliente.getEndereco());
		System.out.println("Telefone: " + novoCliente.getTelefone());
		System.out.println("Idade: " + novoCliente.getIdade());

	}
	
}
