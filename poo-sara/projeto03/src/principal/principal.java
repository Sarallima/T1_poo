package principal;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		// Quest�o 10
		Scanner expr = new Scanner(System.in);
		System.out.println("Qual o raio que voc� deseja calcular ");
		double raio = expr.nextDouble();
		double area;
		double formula = Math.PI * Math.pow(raio, 2);
		System.out.println("�rea = "  + formula);
	}
}
