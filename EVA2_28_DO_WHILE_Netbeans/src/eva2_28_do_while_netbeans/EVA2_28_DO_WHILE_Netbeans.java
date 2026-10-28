
package eva2_28_do_while_netbeans;

import java.util.Scanner;

public class EVA2_28_DO_WHILE_Netbeans {
    final static String USUARIO = "PomPom";
    final static String PWD = "UZ UZ";

    public static void main(String[] args) {
        
        String usu, pwd;
        int intentos = 0; 
        boolean accesoConcedido = false;
        
        Scanner Capt = new Scanner(System.in);
        
        do {
            System.out.println("USUARIO: ");
            usu = Capt.nextLine();
            
            System.out.println("CONTRASEÑA: ");
            pwd = Capt.nextLine();
            
            if (usu.equals(USUARIO) && pwd.equals(PWD)) {
                accesoConcedido = true;
                break; 
            } else {
                intentos++;
                System.out.println("Datos incorrectos. Llevas " + intentos + " de 3 intentos.");
            }
            
        
        } while (!accesoConcedido && intentos < 3);
        
        if (accesoConcedido) {
            System.out.println("||||||||||||||||||||||||||||||");
            System.out.println("!!!!!!!ACCESO CONCEDIDO!!!!!!!");
            System.out.println("||||||||||||||||||||||||||||||");
            System.out.println("BIENVENIDO " + usu);
        } else {
            System.out.println("||||||||||||||||||||||||||||||");
            System.out.println("!!!!!ACCESO BLOQUEADO!!!!!");
            System.out.println("Has superado los 3 intentos.");
            System.out.println("||||||||||||||||||||||||||||||");
        }
    }
}