
package eva2_19_switch2_netbeans;

import java.util.Scanner;

public class EVA2_19_SWITCH2_Netbeans {

    public static void main(String[] args) {
        
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE EL NOMBRE DE LA CARRERA (SISTEMAS, INFORMATICA, ADMINISTRACION)");
        String Carrera = Capt.nextLine();
        
        switch(Carrera){
            case "SISTEMAS":
                System.out.println("ISC");
                break;
            case "INFORMATICA":
                System.out.println("INF");
                break;
            case "ADMINISTRACION":
                System.out.println("LA");
                break;
            default:
                System.out.println("CARRERA NO VALIDA");
        }
        
        
    }
    
}
