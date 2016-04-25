package geometricforms;

// Subclasse de Figura
public class Circunferencia extends Figura {
	
	// Atributo que armazena o raio de uma circunferência.
	private double raio;
	
	// Construtor que recebe como parâmetro um raio.
	public Circunferencia (double raio){
		this.raio = raio;
	}
	
	// Método que sobrescreve o método da superclasse e calcula a área de uma circunferência.
	public double calcularArea(){
		return Math.PI * raio * raio;		
	}
}
