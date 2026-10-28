
package eva2_32_continue_netbeans;


public class EVA2_32_CONTINUE_Netbeans {

    public static void main(String[] args) {
        
        for(int i = 0; i <= 20; i++){
            //PARA SABER SI ES PAR, ME INTERESA EL RESIDUO DE DIVIDIR
            //ENTRE 2
            int residuo = i % 2;
            if(residuo == 0){ //EL NUMERO ES PAR
                System.out.println(i + " - ");
                continue;//INTERRUMPE LA INTERACION ACTUAL
            }
            //System.out.println("SI EL NUMERO ES PAR, ESTO NO SE IMPRIME");
        
    }
        
    }
    
}
