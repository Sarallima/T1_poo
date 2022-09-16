package principal;

import java.util.Scanner; 

public class principal {

	public static void main(String[] args) {
		// questão 14	
		Scanner ano = new Scanner (System.in);
		System.out.println(" Digite o ano do seu nascimento  : ");
		int  num = ano.nextInt();
		int dataA = 2022;
		int dataP = 2005; 
		
		System.out.println("Idade atual: " + (dataA-num));
		System.out.println("Ano atual: " + dataA); 
		
		//idade que a pessoa supostamente teria no ano de 2005.
		 
		if (num<=dataP) {
			System.out.println("A idade no ano de 2005: " + (dataP - num));
		}
		else if (dataP==num) {
		    System.out.println("Você nasceu no ano de 2005");
		}    
		else {
			System.out.println("Você não estavá vivo no ano de 2005");
		}
		
	}
	
}
    


