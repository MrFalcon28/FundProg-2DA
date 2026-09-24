
package eva2_6_else_if;

import java.util.Scanner;


public class EVA2_6_ELSE_IF {

    public static void main(String[] args) {
        
        int Dia = 0;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("NUMERO DEL DIA DE LA SEMANA: (1-7) ");
        Dia = Capt.nextInt();
        
        if(Dia == 1){
            System.out.println("DOMINGO");
        }else if(Dia == 2){
            System.out.println("LUNES");
        }else if(Dia == 3){
            System.out.println("MARTES");
        }else if(Dia == 4){
            System.out.println("MIERCOLES");
        }else if(Dia == 5){
            System.out.println("JUEVES");
        }else if(Dia == 6){
            System.out.println("VIERNES");
        }else if(Dia == 7){
            System.out.println("SABADO");
        }else{
            System.out.println("NO HAY MAS DIAS DE LA SEMANA");
        }
    }
}
