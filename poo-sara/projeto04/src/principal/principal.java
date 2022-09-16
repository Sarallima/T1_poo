package principal;

import java.util.Scanner; 

public class principal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int custo = 600;
	int convite = 15;
	int resposta ; 
	float quant = custo/convite;
	
	System.out.println("Espetáculo beneficente, após cubrir o valor do custo o lucro será doado a orfanatos. ");
	
	System.out.println("A quantidade mímina a ser vendida deve ser: " + quant);
    System.out.println("Digite {0} para NÃO e {1} para sim ");
    System.out.println("Você deseja comprar um ingresso? ");
    resposta = sc.nextInt();
     if( resposta ==1) {
    System.out.println("Obrigado por nos ajudar se divirta. ");
     }
     else {
    	 System.out.println("Ok!");
     }
	}
}
