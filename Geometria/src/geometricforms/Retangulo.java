package geometricforms;

// Subclasse de Figura
public class Retangulo extends Figura {
	
	// Atributos que representam a base e a altura de um retângulo.
	private double base;
	private double altura;
	
	// Construtor que recebe como parâmetro a base e altura de um retângulo.
	public Retangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	/// Método que sobrescreve o método da superclasse e calcula a área de um retângulo.
	public double calcularArea(){
		return base * altura;
	}
}
