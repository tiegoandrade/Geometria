package geometricforms;

// Subclasse de Figura
public class Circunferencia extends Figura {
	
	// Atributo que armazena o raio de uma circunfer�ncia.
	private double raio;
	
	// Construtor que recebe como par�metro um raio.
	public Circunferencia (double raio){
		this.raio = raio;
	}
	
	// M�todo que sobrescreve o m�todo da superclasse e calcula a �rea de uma circunfer�ncia.
	public double calcularArea(){
		return Math.PI * raio * raio;		
	}
}
