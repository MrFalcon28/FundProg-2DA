package eva2_17_covid_netbeans;

import java.util.Scanner;

public class EVA2_17_COVID_Netbeans {

    public static void main(String[] args) {
        //PERSONA DE RIESGO
        //INDICAR SI UNA PERSONA PRESENTA RIESGOS EN CASO DE ENFERMARSE DE COVID
        //SE CONSIDERA QUE ALGUIEN POSEE RIESGO SI TIENE ALGUNA DE LAS CONDICIONES:
        
        //ES  MAYOR A 65
        //TIENE ALGUNA ENFERMEDAD CRONICA
        //POSEE UN INDICE DE MASA CORPORAL (IMC*) MAYOR O IGUAL A 25
        
        //NOTA: CALCULAR IMC --> PESO EN KG / (ESTATURA EN METROS CUADRADOS)
        
        Scanner input = new Scanner(System.in);
        
        double Peso = 70.0, Estatura, IMC;
        int Edad;
        boolean EnfermedadC;
        
        
        System.out.print("INTRODUCE LA EDAD: ");
        Edad = input.nextInt();
        
        System.out.print("INTRODUCE LA ALTURA (estatura en metros): ");
        Estatura = input.nextDouble();
        
        System.out.print("¿TIENES ALGUNA ENFERMEDAD CRONICA? (si = true, no = false): ");
        EnfermedadC = input.nextBoolean();
        
        
        IMC = Peso / (Estatura * Estatura);
        
        
        if ((Edad > 65) || (EnfermedadC == true) || (IMC >= 25)) {
            System.out.println("ES PERSONA DE RIESGO?: Sí");
        } else {
            System.out.println("ES PERSONA DE RIESGO?: No");
        }
        
      
    }
    
}