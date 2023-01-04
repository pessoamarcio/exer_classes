package exer03;

public class ProdutoEletronico {
	private String nome;
	private String marca;
	private String modelo;
	private double preco;
	private int quantidade;
	
	//Construtor
	public ProdutoEletronico(String nome, String marca, String modelo, double preco, int quantidade) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
