
package eva2_26_ejercicio_.pkg2_netbeans;

import java.util.Scanner;

public class EVA2_26_EJERCICIO_2_Netbeans {

    public static void main(String[] args) {
        
        // SOLICITAR UN NUMERO E IMPRIMIR EL SIGUIENTE PATRON CON TEXTO:
        // EJEMPLO: 5 
        // RESULTADO:
        // *
        // **
        // ***
        // ****
        // *****
        
        int Num;
        Scanner Capt = new Scanner(System.in);

        System.out.println("INTRODUCE UN NUMERO PARA EL PATRON: ");
        Num = Capt.nextInt();

        for (int i = 1; i <= Num; i++) {
            for (int p = 1; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println(); 
        }   
        
    }
    
}