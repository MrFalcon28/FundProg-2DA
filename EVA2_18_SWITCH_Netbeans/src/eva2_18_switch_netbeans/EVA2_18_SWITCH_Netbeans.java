
package eva2_18_switch_netbeans;

import java.util.Scanner;

public class EVA2_18_SWITCH_Netbeans {

    public static void main(String[] args) {
         
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE EL NUMERO DEL DIA (1-7): ");
        int dia = Capt.nextInt();
        
        switch(dia){ //EVALUA ENTEROS
            case 1:
                System.out.println("DOMINGO");
                //Se pueden poner cuantas instrucciones necesitemos
                break; //INTERRUMPE LA ESTRUCTURA DE LA CADENA
            case 2:
                System.out.println("LUNES");
                break;
             case 3:
                System.out.println("MARTES");
                break;
             case 4:
                System.out.println("MIERCOLES");
                break;
             case 5:
                System.out.println("JUEVES");
                break;
             case 6:
                System.out.println("VIERNES");
                break;
             case 7:
                System.out.println("SABADO");
                break;
             default: //OPCIONAL POR SI ALGUNA NO COINCIDE O
                 System.out.println("DIA NO VALIDO");
        }   
    }
    
}
