/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package haciendoinventario;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author Jozzelu
 */
public class HaciendoInventario {
    
    
    /*public static void contar (Scanner entrada, int X) {
    
    String inventario [] = new String [X];
    
    for (i=0; i<X ;i++){
    inventario[i]=entrada.nextLine();
    
    }//final del for
    
    } //final metodo*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        File archivo = new File ("src/haciendoinventario/newfile");
        Scanner entrada = new Scanner (archivo);
        
        int X=0, repetidos = 0, s=0;
        String inventario [];
        X=entrada.nextInt();
 
        while (X!=0) {
            
            inventario = new String [X];
            entrada.nextLine();
            
            for (int i=0; i<inventario.length;i++) {
                inventario[i]=entrada.nextLine().toLowerCase();
                System.out.println(inventario[i]);
            }//final For
                for (int j=0;j<inventario.length; j++){
                    
                    if (inventario[j].equals(inventario[s])){
                        repetidos++;
                        System.out.println(repetidos);
                    }
                    s++;
                }// for
        
        }// final del while
        
    }//final while
    
}

