
package eva2_30_menu_netbeans;

import java.util.Scanner;

public class EVA2_30_MENU_Netbeans {

    
    public static void main(String[] args) {
        
        int Opcion;
        
        Scanner Capt = new Scanner (System.in);
        
        do{
            System.out.println("----------------------------------");
            System.out.println("---------------MENU---------------");
            System.out.println("----------------------------------");
            System.out.println("------------1. VENTAS-------------");
            System.out.println("------------2. COMP---------------");
            System.out.println("------------3. PROVEEDORES--------");
            System.out.println("------------4. CLIENTES-----------");
            System.out.println("----------------------------------");
            System.out.println("------------5. SALIR--------------");
            System.out.println("----------------------------------");
            
            System.out.println("A DONDE QUIERES INGRESAR?:");
            Opcion = Capt.nextInt();
            Capt.nextLine();
        }while(Opcion !=  5); //!= Diferente de
        System.out.println("SALIENDO DEL SISTEMA...");
        
        
        
    }
    
}
