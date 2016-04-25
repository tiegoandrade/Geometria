package geometricforms;

//Subclasse de Figura
public class Triangulo extends Figura {
	
	// Atributo que armazena a base e a altura de um tri�ngulo.
	private double base;
	private double altura;
	
	// Construtor que recebe como par�metro a base e a altura de um tri�ngulo.
	public Triangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	// M�todo que sobrescreve o m�todo da superclasse e calcula a �rea de um tri�ngulo.
	public double calcularArea(){
		return (base * altura) / 2;
	}
}
