
package eva2_1_if_netbeans;

import java.util.Scanner;

public class EVA2_1_IF_Netbeans {

    public static void main(String[] args) {
        
        int Edad;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("¿CUAL ES TU EDAD BISONTECOMPA?");
        Edad = Capt.nextInt();
        
        //PARENTESIS OBLIGATORIOS, DENTRO DE LA EXPRESIÓN CONDICIONAL (VERDADERO O FALSO)
        if (Edad >= 18) { //QUE HACEMOS SI ES VERDAD
            System.out.println("YA TE LA RIFASTE BISONTEAMIGO PUEDES PASAR");
        }else{ //QUE HACEMOS SI ES FALSO (FALSO PUEDE SER OPCIONAL)
            System.out.println("YA VALISTE BISONTEAMIGO, NO PUEDES PASAR, TENDRAS QUE ESPERAR A SER MAYOR DE EDAD");
        }
        
    }
    
}
