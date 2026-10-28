
package eva2_35_break_netbeans;

import java.util.Scanner;

public class EVA2_35_BREAK_Netbeans {

    
    public static void main(String[] args) {
        
        int nume, valor = 10;
        
        Scanner Capt = new Scanner(System.in);
        
        while(true){//CICLO INFINITO
            System.out.println("INTRODUCE UN VALOR");
            nume = Capt.nextInt();
            Capt.nextLine();
            
            if(nume == valor){//EL USUARIO ADIVINO Y GANO, TERMINA EL JUEGO
                System.out.println("ADIVINASTE EL NUMERO, FELICIDADES");
                break;
            }
            
            
        }
        
    }
    
}
