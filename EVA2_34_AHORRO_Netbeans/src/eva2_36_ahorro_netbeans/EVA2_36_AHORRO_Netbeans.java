
package eva2_36_ahorro_netbeans;

import java.util.Scanner;

public class EVA2_36_AHORRO_Netbeans {

    public static void main(String[] args) {
        
        // VAMOS A DEPOSITAR HASTA LLEGAR A LA META
        
        Scanner Capt = new Scanner(System.in);
        int ahorro = 15000;
        int deposito;
        int cuenta = 0;
        
        while(true){
            System.out.println("INTRODUCE EL DEPOSITO:");
            deposito = Capt.nextInt();
            Capt.nextLine();
            
           
            if((cuenta + deposito) > ahorro){
                System.out.println("TE PASASTE DE LA META");
                continue;
            }
            
            cuenta += deposito;
            System.out.println("CUENTA = " + cuenta);
            
           
            if(cuenta == ahorro){ 
                System.out.println("META CUMPLIDA");
                break;
            }
        }
        
    }
}