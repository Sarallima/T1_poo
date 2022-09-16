package principal;
import java.util.Scanner; 
// questão 1
public class principal {
public static void main(String[] args) {
	Scanner nota = new Scanner(System.in);
	float n1,n2,n3,n4,sm; 
	
	System.out.println("Digite a  nota da N1: ");
	n1= nota.nextFloat();
	System.out.println("Digite a nota da N2 : ");
	n2= nota.nextFloat();
	System.out.println("Digite a nota da N3 : ");
	n3= nota.nextFloat();
	System.out.println("Digite a nota da N4: ");
	n4=nota.nextFloat();
	sm= (n1+n2+n3+n3+n4);
	System.out.println("A soma das notas dos aluos foi :  " + sm );
}
}
