
package eva2_29_do_while_2_netbeans;

import java.util.Scanner;


public class EVA2_29_DO_WHILE_2_Netbeans {

    
    public static void main(String[] args) {
        
        int monto, cuenta = 5000;
        
        Scanner Capt = new Scanner(System.in);
        
        do{
            System.out.println("CUANTO QUIERES RETIRAR?");
            monto = Capt.nextInt();
            
            //ACUMULADOR
            cuenta = cuenta - monto;
            System.out.println("TU SALDO ES DE: " + cuenta);
        }while(cuenta > 0);
        System.out.println("SE TE ACABO EL DINERO");
        
        
    }
    
}
