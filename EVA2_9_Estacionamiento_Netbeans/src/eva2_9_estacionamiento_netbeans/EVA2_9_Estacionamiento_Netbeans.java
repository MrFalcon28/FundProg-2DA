
package eva2_9_estacionamiento_netbeans;

import java.util.Scanner;

public class EVA2_9_Estacionamiento_Netbeans {

    public static void main(String[] args) {
       
        //SOLICITA EL NUMERO DE HORAS DE ESTACIONAMIENTO Y CALCULAR EL COSTO
        //CONSIDERA HORAS ENTERAS POSITIVAS Y COBRA LA TARIFA CORRESPONDIENTE A TODAS LAS HORAS
        
        int Horas;
        double Costo = 0;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE EL TIEMPO/HORAS QUE PLANEA ESTAR");
        Horas = Capt.nextInt();
        
        if(Horas > 10){
            Costo = 150;
        }else if(Horas > 5){
            Costo = 10 * Horas;
        }else if(Horas > 2){
            Costo = 20 * Horas;
        }else if(Horas > 0){
            Costo = 25 * Horas;
        }else{
            System.out.println("HORA NO VALIDA");
        }
           
        
        
        System.out.println("EL COSTO TOTAL DE HORAS ES: $" + Costo);
        
    }
    
}
