/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio06;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese lado del hexagono");
        double ld=input.nextDouble();
        double a=(3*Math.pow(3,0.5)/2)*Math.pow(ld,2);
        System.out.println("el areas es: "+a);
        ;
    }
    
}
