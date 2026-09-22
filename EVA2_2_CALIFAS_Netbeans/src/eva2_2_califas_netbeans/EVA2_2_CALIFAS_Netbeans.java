
package eva2_2_califas_netbeans;

import java.util.Scanner;


public class EVA2_2_CALIFAS_Netbeans {

    public static void main(String[] args) {
        // PREGUNTAR CALIF
        // EVALUAR
        //MOSTRAR SI ACREDITA O NO ACREDITA
        
        double CALIF;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("¿QUE CALIFICACION HAS OBTENIDO EN EL MODULO?");
        CALIF = Capt.nextDouble();
        
        if(CALIF >= 70){
            System.out.println("FELICIDADES, HAS ACREDITADO EL MODULO");
        }else{
            System.out.println("NO ALCANZAS A ACREDITAR, TENDRAS QUE ESFORZARTE PARA LA PROXIMA");
        }
        
        
    }
    
}
