package exer02;

public class objetoAviao {

	public static void main(String[] args) {
		aviao boeing = new aviao(null, null, 0, 0, 0, 0);
		boeing.setModelo("Boeing 777X");
		boeing.setFabricante("Boeing");
		boeing.setPassageiros(425);
		boeing.setComprimento(76.7);
		boeing.setPesoVazio(188241);
		boeing.setPesoMaximo(351500);

		
		
		System.out.println("Modelo: " + boeing.getModelo());
		System.out.println("Fabricante: " + boeing.getFabricante());
		System.out.println("Capacidade de passageiros: " + boeing.getPassageiros());
		System.out.println("Comprimento: " + boeing.getComprimento() + "m");
		System.out.println("Peso vazio: " + boeing.getPesoVazio() + "kg");
		System.out.println("Peso máximo de decolagem: " + boeing.getPesoMaximo() + "kg");

	}

}
