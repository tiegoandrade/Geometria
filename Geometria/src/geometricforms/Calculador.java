package geometricforms;

// Classe que ir� calcular as �reas das figuras geom�tricas.
public class Calculador {

	public static void main(String[] args) {
		
		// Cria��o dos quadrados
		Quadrado q1 = new Quadrado(3.0);
		Quadrado q2 = new Quadrado(10.0);
		
		// Cria��o dos ret�ngulos
		Retangulo r1 = new Retangulo(2.0, 7.0);
		Retangulo r2 = new Retangulo(5.0, 3.0);
		
		// Cria��o da Circunfer�ncia
		Circunferencia c1 = new Circunferencia(9.0);
		
		// Cria��o do trap�zio
		Trapezio t1 = new Trapezio(9.0, 8.9, 15.0);
		
		// Cria��o do tri�ngulo
		Triangulo tri1 = new Triangulo(9.0 , 15.0);
		
		// Vetor que ir� armazenar as figuras.
		Figura [] figuras = {q1, q2, r1, r2, c1,t1,tri1};
		
		// Cria��o da figura complexa, recebendo como par�metro as figuras.
		FiguraComplexa figuracomplexa = new FiguraComplexa(figuras);
		
		// Calcula a �rea da figura complexa.
		double area = figuracomplexa.calcularArea();
		System.out.println("A �rea da figura complexa �: " + area);
		
		// Calcula a �rea do quadrado.
		double areaQuadrado1 = q1.calcularArea();
		System.out.println("\nA �rea do 1� quadrado �: " + areaQuadrado1);
		
		// Calcula a �rea do ret�ngulo
		double areaRetangulo1 = r1.calcularArea();
		System.out.println("\nA �rea do 1� ret�ngulo �: " + areaRetangulo1);
		
		// Calcula a �rea da circunfer�ncia
		double areaCircunferencia = c1.calcularArea();
		System.out.println("\nA �rea da circunfer�ncia �: " + areaCircunferencia);
		
		// Calcula a �rea do trap�zio
		double areaTrapezio = t1.calcularArea();
		System.out.println("\nA �rea do Trap�zio �: " + areaTrapezio);
		
		// Calcula a �rea do tri�ngulo
		double areaTriangulo = tri1.calcularArea();
		System.out.println("\nA �rea do Tri�ngulo �: " + areaTriangulo);
		
	}
	
}
