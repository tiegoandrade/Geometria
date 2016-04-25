package geometricforms;

//Subclasse de Figura
public class Trapezio extends Figura {
	
	// Atributo que armazena a altura, a base maior e a base menor de um trapézio.
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	// Construtor que recebe como parâmetro a altura, a base maior e a base menor de um trapézio.
	public Trapezio (double altura, double baseMaior, double baseMenor){
		this.altura = altura;
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
	}
	
	// Método que sobrescreve o método da superclasse e calcula a área de um trapézio.
	public double calcularArea(){
		return ((baseMaior + baseMenor) /2) * altura;
	}
}
