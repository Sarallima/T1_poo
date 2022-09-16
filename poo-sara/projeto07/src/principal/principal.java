package principal;
import java.util.Scanner;
public class principal {
public static void main(String[] args) {
	// questão  2
	Scanner nota = new Scanner(System.in);
	float n1,n2,n3,mf; 
	
	System.out.println("Digite su nota da N1: ");
	n1= nota.nextFloat(); 
	System.out.println("Digite a nota da N2 : ");
	n2= nota.nextFloat();
	System.out.println(" Digite sua nota da N3: ");
	n3= nota.nextFloat();
	
	mf= (n1+n2+n3)/3;
	System.out.println("A media do aluno foi : " + mf);
	
}
}
