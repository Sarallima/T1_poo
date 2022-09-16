package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		// Questão 10
		Scanner expr = new Scanner(System.in);
		System.out.println("Qual o raio que você deseja calcular ");
		double raio = expr.nextDouble();
		double area;
		double formula = Math.PI * Math.pow(raio, 2);
		System.out.println("Área = "  + formula);
	}
}
