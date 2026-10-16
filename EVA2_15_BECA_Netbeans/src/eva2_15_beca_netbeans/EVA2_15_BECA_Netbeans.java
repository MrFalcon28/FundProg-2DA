
package eva2_15_beca_netbeans;

public class EVA2_15_BECA_Netbeans {

    public static void main(String[] args) {
        
        //BECA
        //CONDICIONES:
        //PROMEDIO > 95
        //ESTA EN UN EQUIPO REPRESENTATIVO
        
        boolean EquipoRepresentativo = true, TieneBeca;
        int Promedio = 96;
        
        TieneBeca = (Promedio > 95) || (EquipoRepresentativo == true);
        System.out.println("TIENE BECA?: " + TieneBeca);
        
    }
    
}
