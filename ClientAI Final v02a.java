/*Diseñado por:
Ing. Ricardo Celedon
08/06/2021*/

public class Main
{
    static final String VersionInfo = "v0.2a";
    
	public static void main(String[] args)
	{
	    int MayorIndex = 0;
	    String[][] DataBase = {{"Samuel", "Guantes", "Moby Dick (novela)", "Audífonos", "Lentes para sol", "Café"},
	    {"Juan", "Franela deportiva", "Café", "Cafetera", "Café", "Café"},
	    {"Janina", "Lentes para sol", "Zapatos deportivos", "Franela deportiva", "Zapatos deportivos", "Calcetines"},
	    {"Henrique", "2001: A Space Odyssey (dvd)", "Audífonos", "Franela deportiva", "Guantes", "Sandalias"},
	    {"Victor", "Franela deportiva", "Sandalias", "Lentes para sol", "Moby Dick (novela)", "Protector solar"},
	    {"Tobias", "Moby Dick (novela)", "Café", "2001: A Space Odyssey (dvd)", "Audífonos", "Café"}}; //Base de datos completa con usuarios en columna 0 y compra final en ultima columna
	    
	    String[] Nuevo = {"Tomás", "Té verde", "Franela deportiva", "Lentes para sol", "Sandalias"}; //Informacion de comprador, nombre en columna 0
	    int[] Similitud = new int[DataBase.length]; //Vector de Similitud, del tamaño de filas en la base de datos
	    
        System.out.println("Bienvenido a ClientAI " + VersionInfo + "\n");
        System.out.println("Verificando coincidencias de " + Nuevo[0]);
		
		for (int i = 1; i < Nuevo.length; i++) //Compara cada elemento comprado por el cliente, ignorando el indice 0
		{
		    for (int f = 0; f < DataBase.length; f++) //Recorre las filas
		    {
		        for (int c = 1; c < DataBase[f].length - 1; c++) //Recorre las columnas
		        {
		            if (Nuevo[i] == DataBase[f][c]) //Si hay coincidencia en el valor actual
		            {
		                Similitud[f] = Similitud[f] + 1; //Se añade 1 coincidencia al indice f que representa el usuario de la Fila en db
		                
		                if (Similitud[f] > MayorIndex) //Verificando al mismo tiempo cual es la Similitud mayor (parche v0.2a)
		                {
		                    MayorIndex = f; //Indice de Similitud mayor
		                }
		            }
		        }
		    }
		}
		
		//Version anterior (v0.1a) que volvia a recorrer el vector de similitud, fue implementado directo en los recorridos anteriores
		/*for (int j = 0; j < Similitud.length; j++)
		{
		    if (Similitud[j] > MayorIndex)
		    {
		        MayorIndex = j;
		    }
		    System.out.println("Encontradas " + Similitud[j] + " coincidencias con: " + DataBase[j][0]);
		}*/
		
		System.out.println("\nLa mayor coincidencia fue de " + Similitud[MayorIndex] + " con " + DataBase[MayorIndex][0]);
		System.out.println("Basado en esto, la compra proxima probable es: " + DataBase[MayorIndex][DataBase.length - 1]);
		System.out.println("\n\nGracias por usar ClientAI " + VersionInfo + "!");
	}
}