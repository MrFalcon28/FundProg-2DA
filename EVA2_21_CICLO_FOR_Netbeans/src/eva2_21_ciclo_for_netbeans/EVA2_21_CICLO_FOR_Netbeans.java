
package eva2_21_ciclo_for_netbeans;


public class EVA2_21_CICLO_FOR_Netbeans {


    public static void main(String[] args) {
        //ACCESO POR INDICE --> i
        //IMPRIMIR UN LISTADO DEL 1 AL 10:
        //3 PARAMETROS
        //PUNTO DE PARTIDA
        //CONDICION PARA DETENERTSE
        //AVANCE --> 
        
        for(int i = 1; i <= 10; i++){
            //INSTRUCCION A REPETIR
            System.out.print(i + " - ");
        }
        System.out.println();
        
        //20 22 24 26 28 30 32 34 36 38
        
        for(int i = 20; i <= 38; i+=2){
            System.out.print(i + " - ");
        }
        System.out.println();
        
        for(int i = 0; i < 10; i++){
            System.out.print(i + " - ");
        }
        System.out.println();
        
        //DEL 10 AL 1
        
       for(int x = 10; x >= 1; x--){
            System.out.print(x + " - ");
        }
        System.out.println();
        
        //PARES ENTRE 0 Y 20
        
        for(int i = 0; i <= 20; i+=2){
            System.out.print(i + " - ");
        }
        
            
    }
    
}
