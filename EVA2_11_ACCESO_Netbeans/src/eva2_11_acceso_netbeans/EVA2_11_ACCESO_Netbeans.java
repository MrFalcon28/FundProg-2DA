
package eva2_11_acceso_netbeans;

import java.util.Scanner;

public class EVA2_11_ACCESO_Netbeans {
    final static String USUARIO = "Bisonte";
    final static String PWD = "UZ UZ";

    public static void main(String[] args) {
        
        String Usuario, Pwd;
        Scanner Capt = new Scanner(System.in);
        
        System.out.println("USUARIO: ");
        Usuario = Capt.nextLine();
        
        System.out.println("CONTRASEÑA: ");
        Pwd = Capt.nextLine();
        
        //usuario.equals(USUSARIO) UNA ALTERNATIVA SEGURA PARA COMPARAR CADENAS
        if(Usuario.equals(USUARIO) && Pwd.equals(PWD)){
                System.out.println("!!!!!!ACCESO CONCEDIDO!!!!!!");
            }else{
                System.out.println("ACCESO DENEGADO");
       
        }

    }
    
}
