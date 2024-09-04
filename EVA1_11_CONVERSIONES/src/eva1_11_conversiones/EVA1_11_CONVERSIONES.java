package eva1_11_conversiones;

import java.util.Scanner;

/**
 *
 * Diana Sanchez // C a K
 */

public class EVA1_11_CONVERSIONES {

    public static void main(String[] args) {
      
        double far, cent, kel;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("F° a C°");
        System.out.println("Captura los F°");
        far = captu.nextDouble();
        
        cent= (far - 32) / 1.8; //Expresion
        
        System.out.println("Los F° a C° son: " + cent);
        
        System.out.println("C° a F°");
        System.out.println("Captura los C°");
        cent=captu.nextDouble();
        
        far = (cent * 1.8) + 32;
        
        System.out.println("Los C° a F° son: " + far);
        
        
        System.out.println("C° a K°");
        System.out.println("Ingresa los C°");
        cent=captu.nextDouble();
        
        kel= ( cent + 273.15);
        
        System.out.println("Los C° a K° son: " + kel);
        
        System.out.println("K° a C°");
        System.out.println("Ingresa los K°");
        kel=captu.nextDouble();
        
        cent=(kel - 273.15);
        
         System.out.println("Los K° a C° son: " + cent);
        
    }
    
}
