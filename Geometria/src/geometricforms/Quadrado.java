package geometricforms;

// Subclasse de Figura
public class Quadrado extends Figura {
	
	// Atributo que representa o lado de um quadrado.
	private double lado;
	
	// Construtor que recebe como parâmetro os valor dos lados de um quadrado.
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	// Método que sobrescreve o método da superclasse e calcula a área de um quadrado.
	public double calcularArea(){
		return lado * lado;
	}
}
