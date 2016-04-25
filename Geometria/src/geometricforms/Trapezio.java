package geometricforms;

//Subclasse de Figura
public class Trapezio extends Figura {
	
	// Atributo que armazena a altura, a base maior e a base menor de um trap�zio.
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	// Construtor que recebe como par�metro a altura, a base maior e a base menor de um trap�zio.
	public Trapezio (double altura, double baseMaior, double baseMenor){
		this.altura = altura;
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
	}
	
	// M�todo que sobrescreve o m�todo da superclasse e calcula a �rea de um trap�zio.
	public double calcularArea(){
		return ((baseMaior + baseMenor) /2) * altura;
	}
}
