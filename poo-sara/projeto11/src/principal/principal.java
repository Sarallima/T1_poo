package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("insira o tamanho da escada : ");
		float tamanho = sc.nextFloat();
		System.out.println("insira a altura que deseja empregar ao quadro : ");
		float altura = sc.nextFloat();
		float distanciateste = tamanho * tamanho - altura * altura;
		System.out.println("A distancia é : " +  Math.sqrt(distanciateste));

	}

}
