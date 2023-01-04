package exer02;

//Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

public class aviao {

	private String modelo;
	private String fabricante;
	private int passageiros;
	private double comprimento;
	private double pesoVazio;
	private double pesoMaximo;
	
	
	public aviao(String modelo, String fabricante, int passageiros, double comprimento, double pesoVazio, double pesoMaximo) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.passageiros = passageiros;
		this.comprimento = comprimento;
		this.pesoVazio = pesoVazio;
		this.pesoMaximo = pesoMaximo;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public int getPassageiros() {
		return passageiros;
	}


	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}


	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}


	public double getPesoVazio() {
		return pesoVazio;
	}


	public void setPesoVazio(double pesoVazio) {
		this.pesoVazio = pesoVazio;
	}


	public double getPesoMaximo() {
		return pesoMaximo;
	}


	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	
	
}
