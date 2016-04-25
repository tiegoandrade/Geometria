package geometricforms;

// Subclasse de Figura
public class Retangulo extends Figura {
	
	// Atributos que representam a base e a altura de um ret�ngulo.
	private double base;
	private double altura;
	
	// Construtor que recebe como par�metro a base e altura de um ret�ngulo.
	public Retangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	/// M�todo que sobrescreve o m�todo da superclasse e calcula a �rea de um ret�ngulo.
	public double calcularArea(){
		return base * altura;
	}
}
