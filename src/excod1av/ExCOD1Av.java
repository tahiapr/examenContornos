/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excod1av;

import java.util.Scanner;

/**
 *
 * @author damian
 */
public class ExCOD1Av {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Buenos días, ¿Cuál es  tu nombre?");
        String  respuesta = sc.nextLine();
        
        System.out.println("Encantada de conocerte, "+respuesta);
        
    }
    
}
