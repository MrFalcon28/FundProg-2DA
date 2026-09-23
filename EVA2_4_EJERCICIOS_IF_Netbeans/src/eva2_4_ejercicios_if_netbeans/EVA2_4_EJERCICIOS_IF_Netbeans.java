
package eva2_4_ejercicios_if_netbeans;

import java.util.Scanner;

public class EVA2_4_EJERCICIOS_IF_Netbeans {


    public static void main(String[] args) {
        
        double Salario, Bono, SalarioFinal;
        String Nombre;

        Scanner Capt = new Scanner(System.in);

        System.out.println("INGRESE EL NOMBRE DEL EMPLEADO:");
        Nombre = Capt.nextLine();

        System.out.println("INGRESA EL SALARIO MENSUAL QUE SE GANA: $");
        Salario = Capt.nextDouble();

        if (Salario < 12000) {
            Bono = Salario * 0.1;
        } else {
            Bono = Salario * 0.05;
        }

        SalarioFinal = Salario + Bono;
        
        System.out.println("!!!!!!!!!!!!!!!!!!!!DATOS OBTENIDOS!!!!!!!!!!!!!!!!!!");

        System.out.println("NOMBRE: " + Nombre);
        System.out.println("SALARIO BASE: $" + Salario);
        System.out.println("BONO ACREDITADO: $" + Bono);
        System.out.println("SALARIO FINAL ACREDITADO: $" + SalarioFinal);
    }
        
}
    