
package eva2_10_califas_netbeans;

import java.util.Scanner;

public class EVA2_10_CALIFAS_Netbeans {
    
    public static void main(String[] args) {
        
        //SOLICITA EL PROMEDIO DE UN ESTUDIANTE Y DETERMINA SU DESEMPEÑO
        
        double Promedio;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE TU PROMEDIO BASE");
        Promedio = Capt.nextDouble();
        
        if (Promedio < 0){
            System.out.println("DATO INVALIDO");
        }else if(Promedio > 100){
            System.out.println("DATO INVALIDO");
        }else if(Promedio < 70){
            System.out.println("INSUFICIENTE");
        }else if(Promedio < 80){
            System.out.println("ACEPTABLE");
        }else if(Promedio < 90){
            System.out.println("BUENO");
        }else{
            System.out.println("SOBRESALIENTE");
        }
        
    }
    
}
