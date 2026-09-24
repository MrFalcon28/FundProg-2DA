
package eva2_7_else_if_netbeans;

import java.util.Scanner;

public class EVA2_7_ELSE_IF_Netbeans {


    public static void main(String[] args) {
        // TEMPERATURA
        // 35 MUY CALIDO
        // 20 AGRADABLE
        //10 FRESCO
        // MUY FRIO
        
        int Temp;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("¿CUAL ES LA TEMPERATURA?");
        Temp = Capt.nextInt();
        
        if(Temp >= 35 ){
            System.out.println("!!MUY CALIDO!!");
        }else if(Temp >= 20){
            System.out.println("!AGRADABLE!!");
        }else if(Temp >= 10){
            System.out.println("--MUY FRESCO--");
        }else{
            System.out.println("ERES UN BLOQUE DE HIELO");
        }
    } 
    
}
