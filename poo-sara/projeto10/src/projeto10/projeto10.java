package projeto10;
import java.util.Scanner;
public class projeto10 {

	public static void main(String[] args) {
		// questao 24
    Scanner sc = new Scanner(System.in);
    System.out.print("INSIRA AS HORAS COMO UM NUMERO REAL: ");
    float hora = sc.nextFloat();
    int h = (int)hora;
    float minutos = hora - h;
    float conv = (h*60) + (minutos*60);
    System.out.print("ESSAS HORAS EM MINUTOS SÃO: " +  conv +  "minutos");
    
    
    
	}

}
