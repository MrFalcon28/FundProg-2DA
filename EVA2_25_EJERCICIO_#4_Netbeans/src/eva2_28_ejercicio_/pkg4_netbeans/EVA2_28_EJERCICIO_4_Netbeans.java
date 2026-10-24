
package eva2_28_ejercicio_.pkg4_netbeans;

import java.util.Scanner;


public class EVA2_28_EJERCICIO_4_Netbeans {

    
    public static void main(String[] args) {
        //SOLICITAR DOS NUMEROS: BASE  Y EXPONENTE
        //CALCULAR LA POTENCIA
        //EJEMPLO:  3 Y 2
        //RESULTADO: 3 ELEVADO A LA 2 = 9
        
        int Base, Expo, Resul = 1;
       
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE LA BASE:");
        Base = Capt.nextInt();
        
        System.out.println("INTRODUCE EL EXPONENTE:");
        Expo = Capt.nextInt();
        
       
        for(int i = 1; i <= Expo; i++) {
            Resul = Resul * Base;
        }
        
        System.out.println(Base + " elevado a la " + Expo + " = " + Resul);
    }
    
}
