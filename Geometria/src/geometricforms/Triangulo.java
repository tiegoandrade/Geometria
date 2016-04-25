package geometricforms;

//Subclasse de Figura
public class Triangulo extends Figura {
	
	// Atributo que armazena a base e a altura de um triângulo.
	private double base;
	private double altura;
	
	// Construtor que recebe como parâmetro a base e a altura de um triângulo.
	public Triangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	// Método que sobrescreve o método da superclasse e calcula a área de um triângulo.
	public double calcularArea(){
		return (base * altura) / 2;
	}
}
