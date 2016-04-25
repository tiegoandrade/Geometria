package geometricforms;

//Subclasse de Figura
public class FiguraComplexa extends Figura {
	
	// Atributo onde é armazenado as figuras (quadrado, Triângulo, Trapézio, etc)
	private Figura [] figuras;
	
	// Construtor que recebe como parâmetro um vetor de figuras.
	public FiguraComplexa (Figura [] figuras){
		this.figuras = figuras;
	}
	
	// Método que calcula a area de todas as figuras e soma-as.
	public double calcularArea(){
		double areaTotal = 0.0;
		
		for (int i = 0 ; i < figuras.length ; i++){
			areaTotal = areaTotal + figuras[i].calcularArea();
		}
		return areaTotal;
	}
	
}
