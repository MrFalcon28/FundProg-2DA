
package eva2_10_califas_netbeans;

import java.util.Scanner;

public class EVA2_10_CALIFAS_Netbeans {
    
    public static void main(String[] args) {
        
        //SOLICITA EL PROMEDIO DE UN ESTUDIANTE Y DETERMINA SU DESEMPEÑO
        
        int Promedio;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE TU PROMEDIO BASE: ");
        Promedio = Capt.nextInt();
        
        if (Promedio > 100){
            System.out.println("DATO INVALIDO");
        }else if(Promedio >= 90){
            System.out.println("CALIFICACION SOBRESALIENTE");
        }else if(Promedio >= 80){
            System.out.println("CALIFICACION BUENA");
        }else if(Promedio >= 70){
            System.out.println("CALIFICACION ACEPTABLE");
        }else if(Promedio >= 0){
            System.out.println("CALIFICACION INSUFICIENTE");
        }else{
            System.out.println("CALIFICACION INVALIDA");
        }
        
    }
    
}
