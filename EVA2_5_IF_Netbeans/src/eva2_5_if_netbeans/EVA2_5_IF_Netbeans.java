
package eva2_5_if_netbeans;

import java.util.Scanner;


public class EVA2_5_IF_Netbeans {

    public static void main(String[] args) {
        //ANIDAMIENTO
        
        int Edad, Credencial = 0;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("¿CUAL ES TU EDAD?");
        Edad = Capt.nextInt();
        
        if(Edad >= 18){
            System.out.println("MUY BIEN, ¿PERO TIENES CREDENCIAL DE ELECTOR? (1 = Si, 0 = No): ");
            Credencial = Capt.nextInt();
            
        }if(Credencial == 1){ 
            System.out.println("MUY BIEN, PUEDES PASAR PANA");
        }else{
            System.out.println("LO SIENTO PANA, NO PUEDES PASAR ENTONCES.");
        }
        
    }
    
}
