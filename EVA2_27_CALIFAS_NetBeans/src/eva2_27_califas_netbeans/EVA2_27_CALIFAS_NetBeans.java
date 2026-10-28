
package eva2_27_califas_netbeans;

import java.util.Scanner;


public class EVA2_27_CALIFAS_NetBeans {

   
    public static void main(String[] args) {
        
        int Califa = 0;
        int suma = 0; 
        int cant = 0; 
        
        Scanner Capt = new Scanner(System.in);

        while(Califa > -1){
            System.out.println("INTRODUCE LA CALIFICACION A CAPTURAR: (-1 PARA TERMINAR)");
            Califa = Capt.nextInt();
            Capt.nextLine();
            
            
            if(Califa > -1){
                suma = suma + Califa;
                cant++;
            }
        }
        
        
        if(cant > 0){
            double promedio = (double) suma / cant;
            System.out.println("El promedio es: " + promedio);
        }
        
    }
    
}
