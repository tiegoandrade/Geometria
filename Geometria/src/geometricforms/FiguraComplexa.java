package geometricforms;

//Subclasse de Figura
public class FiguraComplexa extends Figura {
	
	// Atributo onde � armazenado as figuras (quadrado, Tri�ngulo, Trap�zio, etc)
	private Figura [] figuras;
	
	// Construtor que recebe como par�metro um vetor de figuras.
	public FiguraComplexa (Figura [] figuras){
		this.figuras = figuras;
	}
	
	// M�todo que calcula a area de todas as figuras e soma-as.
	public double calcularArea(){
		double areaTotal = 0.0;
		
		for (int i = 0 ; i < figuras.length ; i++){
			areaTotal = areaTotal + figuras[i].calcularArea();
		}
		return areaTotal;
	}
	
}
