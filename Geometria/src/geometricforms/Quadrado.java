package geometricforms;

// Subclasse de Figura
public class Quadrado extends Figura {
	
	// Atributo que representa o lado de um quadrado.
	private double lado;
	
	// Construtor que recebe como par�metro os valor dos lados de um quadrado.
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	// M�todo que sobrescreve o m�todo da superclasse e calcula a �rea de um quadrado.
	public double calcularArea(){
		return lado * lado;
	}
}
