
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
        
        String cade = "";

        for (int i = 1; i <= Num; i++) {
            cade = cade + "*";
            System.out.println(cade); 
        }   
        
    }
    
}