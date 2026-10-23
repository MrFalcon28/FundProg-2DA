
package eva2_23_capturar_netbeans;

import java.util.Scanner;


public class EVA2_23_CAPTURAR_Netbeans {

   
    public static void main(String[] args) {
        
        //SOLICITAR LAS CALIFICACIONES Y PROMEDIOS
        
        int Cant, Calf,calf = 0;
        double Promedio;
        
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("CUANTAS CALIFICACIONES VAS A CAPTURAR?");
        Cant = Capt.nextInt();
        
        for(int i = 0; i < Cant; i++){//for(int i = 1; i <= Cant; i++)
            System.out.println("CAPTURA LA CALIFICACION: ");
            Calf = calf + Capt.nextInt();
            Capt.nextLine();
        }
        System.out.println("ACUMULADO = " + calf);
        Promedio = calf / (Cant * 1.0);
        System.out.println("PROMEDIO" + Promedio);

        
        
    }
    
}
