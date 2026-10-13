
package eva2_8_menu_netbeans;

import java.util.Scanner;

public class EVA2_8_MENU_Netbeans {

    public static void main(String[] args) {
        
        int Opcion = 0;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> MENU DE LA CUCARACHA CROCANTE<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("1. VENTAS");
        System.out.println("2. PROOVEDORES");
        System.out.println("3. EMPLEADOS");
        System.out.println("4. INVENTARIO");
        System.out.println("5. SALIR");
        System.out.println(">SELECCIONA UNA OPCION<");
        Opcion = Capt.nextInt();
        
        if(Opcion == 1){
            System.out.println("PANTALLA DE VENTAS");
        }else if(Opcion == 2){
            System.out.println("PANTALLA DE PROVEEDORES");
        }else if(Opcion == 3){
            System.out.println("PANTALLA DE EMPLEADOS");
        }else if(Opcion == 4){
            System.out.println("PANTALLA DE INVENTARIO");
        }else if(Opcion == 5){
            System.out.println("PANTALLA DE INVENTARIO");
        }else if(Opcion == 6){
            System.out.println("BYE, BYE");
        }else{
            System.out.println("PARECE SER QUE NO HAS ELEGIDO UNA OPCION VALIDA");
        }
    }
    
}
