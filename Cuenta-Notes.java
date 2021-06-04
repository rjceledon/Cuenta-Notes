import java.util.Scanner; //Para ingresar datos a consola
/*Diseñado por Ing. Ricardo Celedon
03/06/2021*/

public class Main
{
public static void main(String[] args)
{
float Nota2; //Nota a obtener en el segundo corte o definitiva
float Nota1; //Nota obtenida en el primer corte
Scanner sc = new Scanner(System.in);
System.out.println("Bienvenido a Calcu-Notes v0.1a!");
System.out.println("\nSe requieren 15 ptos. en definitiva para mantener el promedio.");
System.out.print("\nPor favor ingrese nota que obtuvo en el primer corte: ");
Nota1 = sc.nextFloat(); //Introduccion del dato, acepta decimales al ser float

Nota2 = 30 - Nota1;
/*Despeje de de N2 de la siguiente formula:
(N1+N2)/2 >= 15
Para obtener valor de N2 necesario para nota final sea 15 o mas ptos.*/

if (Nota2 <= 20 && Nota2 > 0) //Si es posible obtener puntaje que cumpla la formula
{
System.out.println("\nDebe obtener: " + Nota2 + " ptos. para mantener su promedio.");
}
else if (Nota2 > 20) //Si la nota es imposible (es decir mayor de 20 ptos.)
{
System.out.println("\nNo es posible mantener su promedio habiendo obtenido esa nota.");
}
else
/*Si la nota es negativa, es decir que ya se aprobo
No se supone que esta condicion se cumpla, para que esto se cumpla el
valor de N1 debe ser 30, lo cual no es posible ya que la nota maxima es 20
Solo se agrega para evitar errores y salidas negativas.*/
{
System.out.println("\nYa su promedio se mantiene con la nota obtenida.");
}
System.out.println("\n\nGracias por usar Calcu-Notes v0.1a!");
}
}
