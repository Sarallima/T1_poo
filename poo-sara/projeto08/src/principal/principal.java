package principal;
import java.util.Scanner;
public class principal {
public static void main(String[] args) {
	// Questão 3
 Scanner nota = new Scanner(System.in);
 float n1,n2,n3,p1,p2,p3,mf;
 
 System.out.println("Digite sua nota da n1 : ");
 n1 = nota.nextFloat();
 System.out.println("Digite o peso 1 : ");
 p1= nota.nextFloat();
 System.out.println("Digite sua nota da n2: ");
 n2 = nota.nextFloat();
 System.out.println(" Digite o peso 2 : ");
 p2 = nota.nextFloat();
 System.out.println("Digite sua nota da n3 : ");
 n3= nota.nextFloat();
 System.out.println("Digite o peso 3: ");
 p3= nota.nextFloat();
 mf= (n1*p1+ n2*p2+ n3*p3)/(p1+p2+p3);
 System.out.println("A media é " + mf);
}
}
