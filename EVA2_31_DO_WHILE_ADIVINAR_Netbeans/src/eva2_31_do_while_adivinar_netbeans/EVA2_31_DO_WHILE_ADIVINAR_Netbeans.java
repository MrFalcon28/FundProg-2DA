
package eva2_31_do_while_adivinar_netbeans;

import java.util.Scanner;

public class EVA2_31_DO_WHILE_ADIVINAR_Netbeans {

    public static void main(String[] args) {
        
        int Num = 7;
        int Intento;
        
        Scanner Capt = new Scanner(System.in);
        
        do {
            System.out.print("CUAL CREES QUE SEA EL NUMERO? ");
            Intento = Capt.nextInt();
            
        } while (Intento != Num);
        
        System.out.println("LO HAS ADIVINADO");
        
    }
    
}