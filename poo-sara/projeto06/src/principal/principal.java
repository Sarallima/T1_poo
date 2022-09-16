package principal;

import java.util.Scanner;

public class principal {
public static void main(String[] args) {
	//questão 23
	Scanner num = new Scanner(System.in);
	System.out.println("Digite um número real: ");
	float numR = num.nextFloat();
	
	int inteira = (int) numR;
	double fracionaria = numR-inteira;
	double arredondado = Math.round(numR);
	
	System.out.println("Parte inteira: " + inteira);
	System.out.println("parte fracionaria: " + fracionaria);
	System.out.println("parte arredondada: " + arredondado);
	
}
}
