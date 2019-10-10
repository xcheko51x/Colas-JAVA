import java.util.ArrayList;
import java.util.Scanner;

public class EjemploCola {

	 static Scanner teclado = new Scanner(System.in);
	 static ArrayList<String> cola = new ArrayList<>();
	 static ArrayList<String> aux = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = -1;
        
        while(opcion != -1) {
            System.out.println("---------------------");
            System.out.println("1 - Encolar");
            System.out.println("2 - Desencolar");
            System.out.println("3 - Vaciar cola");
            System.out.println("0 - Salir");
            System.out.println("---------------------");
            System.out.println("Seleccione una opción: ");
            opcion = teclado.nextInt();
            System.out.println("");
        }

	}

}
