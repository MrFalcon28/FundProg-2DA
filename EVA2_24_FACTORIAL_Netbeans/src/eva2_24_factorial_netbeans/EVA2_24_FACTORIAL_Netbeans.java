
package eva2_24_factorial_netbeans;

import java.util.Scanner;


public class EVA2_24_FACTORIAL_Netbeans {


    public static void main(String[] args) {
        
        int Num, Factor = 1;
        Scanner Capt = new Scanner(System.in);
        
        //CASO 1: 5 = 5 X 4 X 3 X 2 X 1 = 120
        System.out.println("VALOR A CALCULAR: ");
        Num = Capt.nextInt();
        
        for (int i = Num; i >= 1; i--) {
            Factor = Factor * i;
        }
        
        System.out.println(" El factorial de " + Num + " - " +Factor);
        
        //CASO 2: 5 = 1 X 2 X 3 X 4 X 5 = 120
        
        Factor = 1;
        
        for (int i = 1; i <= Num; i++) {
            Factor = Factor * i;
        }
        
        System.out.println(" El Segundofactorial de " + Num + " - " +Factor);
              
    }
    
}
