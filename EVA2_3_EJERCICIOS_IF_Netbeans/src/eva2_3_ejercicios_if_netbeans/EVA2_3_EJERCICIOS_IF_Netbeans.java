
package eva2_3_ejercicios_if_netbeans;

import java.util.Scanner;

public class EVA2_3_EJERCICIOS_IF_Netbeans {

    public static void main(String[] args) {
        
        
        double Precio, Total, Subtotal, Descuento = 0;
        int Cantidad;
        
        Scanner Capt = new Scanner(System.in);
        
        System.out.print("INTRODUCE EL PRECIO DEL PRODUCTO: $");
        Precio = Capt.nextDouble();
        
        System.out.println("INTRODUCE LA CANTIDAD QUE SE QUIERE COMPRAR DEL PRODUCTO: ");
        Cantidad = Capt.nextInt();
        
        Subtotal = Precio * Cantidad;
        
        if(Precio >= 1000){
            Descuento = Subtotal * 0.1;
        }
        
        Total = Subtotal - Descuento;
        
        System.out.println("!!!!!!!!!!IMPRIMIENDO SU RECIBO!!!!!!!!!!!");
        
        System.out.println("SU SUBTOTAL DE LA COMPRA FUE: $" + Subtotal);
        System.out.println("EL DESCUENTO APLICADO DE LA COMPRA FUE DE: $" + Descuento);
        System.out.println("EL TOTAL DE LA COMPRA FUE: $" + Total);
        
        
        
        
    }
    
}
