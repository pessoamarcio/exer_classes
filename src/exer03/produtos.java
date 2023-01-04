package exer03;

public class produtos {

	
	public static void main(String[] args) {
		ProdutoEletronico produto1 = new ProdutoEletronico("Smartphone", "Asus", "Rog Phone 6", 5250.99, 100);
		

		
		System.out.println("Nome " + produto1.getNome());
		System.out.println("Marca " + produto1.getMarca());
		System.out.println("Modelo " + produto1.getModelo());
		System.out.println("Preço " + produto1.getPreco());
		System.out.println("Quantidade " + produto1.getQuantidade());
			
		
	}
}
