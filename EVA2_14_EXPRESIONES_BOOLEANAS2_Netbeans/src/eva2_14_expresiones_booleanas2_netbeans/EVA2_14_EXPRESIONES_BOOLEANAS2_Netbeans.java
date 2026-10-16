
package eva2_14_expresiones_booleanas2_netbeans;

import java.util.Scanner;


public class EVA2_14_EXPRESIONES_BOOLEANAS2_Netbeans {

    public static void main(String[] args) {
        
        //BECA
        //CONDICIONES:
        //PROMEDIO > 95
        //ESTA EN UN EQUIPO REPRESENTATIVO
        
        int Promedio;
        String Equipo;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("¿CUAL ES TU PROMEDIO BASE?");
        Promedio = Capt.nextInt();
        Capt.nextLine();
        
        System.out.println("¿PERTENECES A UN EQUIPO REPRESENTATIVO? (S/N)");
        Equipo = Capt.nextLine();
        
        
        if( (Promedio >= 95) || Equipo.equals("S") ){
            System.out.println("BECA CONCEDIDA");
        }else{
            System.out.println("BECA DENEGADA");
        }
    }
    
}
