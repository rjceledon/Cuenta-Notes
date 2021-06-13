/*Diseñado por:
Ing. Ricardo Celedon
08/06/2021*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String[] nombre = new String[4];
	    
		System.out.println("Bienvenido a NameZ v0.1a!\n");
		System.out.println("Por favor introduzca los nombres de 4 personas:");
		
		
		for (int i = 0; i < nombre.length; i++)
		{
		    nombre[i] = sc.nextLine();
		    System.out.println("~ Nombre guardado: " + nombre[i]);
		}
		
		System.out.println("\n\nGracias por usar NameZ v0.1a!");
	}
}
