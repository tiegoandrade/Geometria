package geometricforms;

// Classe que irá calcular as áreas das figuras geomêtricas.
public class Calculador {

	public static void main(String[] args) {
		
		// Criação dos quadrados
		Quadrado q1 = new Quadrado(3.0);
		Quadrado q2 = new Quadrado(10.0);
		
		// Criação dos retângulos
		Retangulo r1 = new Retangulo(2.0, 7.0);
		Retangulo r2 = new Retangulo(5.0, 3.0);
		
		// Criação da Circunferência
		Circunferencia c1 = new Circunferencia(9.0);
		
		// Criação do trapézio
		Trapezio t1 = new Trapezio(9.0, 8.9, 15.0);
		
		// Criação do triângulo
		Triangulo tri1 = new Triangulo(9.0 , 15.0);
		
		// Vetor que irá armazenar as figuras.
		Figura [] figuras = {q1, q2, r1, r2, c1,t1,tri1};
		
		// Criação da figura complexa, recebendo como parâmetro as figuras.
		FiguraComplexa figuracomplexa = new FiguraComplexa(figuras);
		
		// Calcula a área da figura complexa.
		double area = figuracomplexa.calcularArea();
		System.out.println("A Área da figura complexa é: " + area);
		
		// Calcula a área do quadrado.
		double areaQuadrado1 = q1.calcularArea();
		System.out.println("\nA Área do 1° quadrado é: " + areaQuadrado1);
		
		// Calcula a área do retângulo
		double areaRetangulo1 = r1.calcularArea();
		System.out.println("\nA Área do 1° retângulo é: " + areaRetangulo1);
		
		// Calcula a área da circunferência
		double areaCircunferencia = c1.calcularArea();
		System.out.println("\nA Área da circunferência é: " + areaCircunferencia);
		
		// Calcula a área do trapézio
		double areaTrapezio = t1.calcularArea();
		System.out.println("\nA Área do Trapézio é: " + areaTrapezio);
		
		// Calcula a área do triângulo
		double areaTriangulo = tri1.calcularArea();
		System.out.println("\nA Área do Triângulo é: " + areaTriangulo);
		
	}
	
}
