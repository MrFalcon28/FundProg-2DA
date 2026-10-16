
package eva2_13_expresiones_booleanas_netbeans;


public class EVA2_13_EXPRESIONES_BOOLEANAS_Netbeans {

    
    public static void main(String[] args) {
        
        //OPERACIONES BOOLEANAS
        // AND-> &&
        // OR -> ||
        // NOT -> !
        
        // AND --> PARA QUE SEA VERDAD, AMBAS EXPRESIONES DEBEN SER VERDAD (TRUE)
        boolean EntrarAntro, TieneCredencial = false;
        int Edad = 18;
        
        EntrarAntro = (Edad >= 18) && (TieneCredencial == true);
        System.out.println("Puedes entrar al Antro: " + EntrarAntro);
        
        // OR --> PARA QUE SE VERDAD, SOLO (CUALQUIERA) DEBE SER VERDAD
        boolean EstaSoleado = false, TienesDinero = false;
        boolean PermisoSalir;
        
        PermisoSalir = (EstaSoleado == true) || (TienesDinero == true);
         System.out.println("Permiso para salir de paseo: " + PermisoSalir);
        
    }
    
}
