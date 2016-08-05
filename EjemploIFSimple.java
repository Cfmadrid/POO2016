import java.util.Scanner;

public class EjemploIFSimple {
	public static void main(String args[]) {
 Scanner in = new Scanner(System.in);

 System.out.println("Por favor ingrese un número entero: ");
 int numeroLeido = in.nextInt();

 if (numeroLeido %2 == 0)
 System.out.println("El número " + numeroLeido + " espar");
 else
 System.out.println("El número " + numeroLeido + " esimpar");
}
}
