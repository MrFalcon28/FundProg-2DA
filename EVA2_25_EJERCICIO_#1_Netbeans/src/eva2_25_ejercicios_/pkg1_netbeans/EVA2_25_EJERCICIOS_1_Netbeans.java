
package eva2_25_ejercicios_.pkg1_netbeans;

import java.util.Scanner;

public class EVA2_25_EJERCICIOS_1_Netbeans {

    public static void main(String[] args) {
        
        //SOCILITAR UN NUMERO INICIAL Y FINAL E IMPRIMIR LA LISTA DE NUMEROS ENTRE ELLOS:
        //EJEMPLO 4 Y 11
        //RESULTADO: 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11
        
        int NumI, NumF;
        
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE EL NUMERO INICIAL: ");
        NumI = Capt.nextInt();
        
        System.out.println("INTRODUCE EL NUMERO FINAL: ");
        NumF = Capt.nextInt();
        
        for(int i = NumI; i <= NumF; i++){
            if(i == NumF){
                System.out.print(i);
            } else {
                System.out.print(i + " - " );
            }
        }
        
    }
    
}
