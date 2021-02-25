/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares59659;

/**
 *
 * @author reyap
 */
public class NumParesImpares59659 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 1;
        int ip = 0;
        int in = 0;
        
        while (i <= 100) {
            if (i % 2 == 0) {
                ip = ip + i;
            } else {
                in = in + i;
            }
            
            i++;
            
            System.out.println("Suma pares = " + ip);
            System.out.println("Suma impares = " + in);
        }
    }
    
}
