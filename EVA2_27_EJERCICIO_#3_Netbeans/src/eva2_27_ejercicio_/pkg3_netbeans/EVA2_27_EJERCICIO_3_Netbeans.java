
package eva2_27_ejercicio_.pkg3_netbeans;

import java.util.Scanner;


public class EVA2_27_EJERCICIO_3_Netbeans {

    
    public static void main(String[] args) {
        
        //SOLICITAR UN NUMERO E IMRPIMIR SU TABLA DE MULTIPLICAR
        // EJEMPLO: 3
        // 3 X 1 = 3
        // 3 X 2 = 6
        // ...
        // 3 X 10 = 30
        
        int Num;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE UN NUMERO PARA LA TABLA DE MULTIPLICAR:");
        Num = Capt.nextInt();
        
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(Num + " x " + i + " = " + (Num * i));
        
        }
    }
    
}
