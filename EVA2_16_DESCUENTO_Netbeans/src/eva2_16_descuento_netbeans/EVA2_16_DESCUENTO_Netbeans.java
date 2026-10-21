package eva2_16_descuento_netbeans;

import java.util.Scanner;

public class EVA2_16_DESCUENTO_Netbeans {

    public static void main(String[] args) {
        //DESCUENTO DE AUTOBUS
        //INDICA SI UNA PERSONA TIENE DESCUENTO EN EL AUTOBUS.
        //SE DEBEN CUMPLIR LOS CRITERIOS SIGUIENTES:
        
        //ES MENOR DE EDAD
        //ES ESTUDIANTE(DEBE POSEER CREDENCIAL VIGENTE)
        //SI TIENE MAS DE 60 AÑOS, CREDENCIAL DEL ISEN.
        
        Scanner input = new Scanner(System.in);
        
        boolean CredencialVigente = true, Isen = false;
        int Edad = 18;
        boolean EsEstudiante;
        
        System.out.print("¿ES ESTUDIANTE? (si = true, no = false): ");
        EsEstudiante = input.nextBoolean();
        
        if ((Edad < 18) || ((EsEstudiante == true) && (CredencialVigente == true)) || ((Edad > 60) && (Isen == true))) {
            System.out.println("TIENES DESCUENTO PARA EL AUTOBUS?: Sí");
        } else {
            System.out.println("TIENES DESCUENTO PARA EL AUTOBUS?: No");
        }

    }
    
}
