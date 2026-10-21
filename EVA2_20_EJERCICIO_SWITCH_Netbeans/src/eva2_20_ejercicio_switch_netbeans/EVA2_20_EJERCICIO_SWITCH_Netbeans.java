
package eva2_20_ejercicio_switch_netbeans;

import java.util.Scanner;


public class EVA2_20_EJERCICIO_SWITCH_Netbeans {

    public static void main(String[] args) {
        //CALCULAR
        //PEDIR DOS VALORES ENTEROS
        //PEDIR LA OPERACION:
        //1. SUMA
        //2. RESTA
        //3. MULTIPLICACION
        //4. DIVISION
        //CUALQUIER OTRO VALOR --> OPREACION INVALIDA
        //MOSTRAR RESULTADO
        
        int valor1, valor2, Operacion;
        
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("INTRODUCE EL VALOR 1: ");
        valor1 = Capt.nextInt();
        
        System.out.println("INTRODUCE EL VALOR 2: ");
        valor2 = Capt.nextInt();
        
        System.out.println("------------------------------------------------");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("------------------------------------------------");
        System.out.println("QUE OPERACION DESEAS REALIZAR?: ");
        Operacion = Capt.nextInt();
        
        switch(Operacion){
            case 1:
            int Suma = valor1 + valor2;
            System.out.println("EL RESULTADO DE LA SUMA ES:" + Suma);
            break;
            
            case 2:
            int Resta = valor1 - valor2;
             System.out.println("EL RESULTADO DE LA RESTA ES:" + Resta);
            break;
            
            case 3:
            int Mult = valor1 * valor2;
             System.out.println("EL RESULTADO DE LA MULTIPLICACION ES:" + Mult);
            break;
            
            case 4:
            int Divi = valor1 / valor2;
             System.out.println("EL RESULTADO DE LA DIVISION ES:" + Divi);
            break;
            
            default:
                 System.out.println("OPERACION INVALIDA");
                
        }
    }
    
}
