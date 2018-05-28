/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

import java.util.Scanner;

/**
 *
 * @author Annisa Gustien W
 */
public class Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Input bilangan 1 : ");
        System.out.println("Input bilangan 2 : ");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int x;
        for (int i = 1; i <= 100; i++){
            if ( A <= B){
                 System.out.println((A+1) + ",");
            }
        }
        
        /*if (x % 2 == 1){
            System.out.println("ganjil");
        }else if (x % 3 == 1){
            System.out.println("genap");
        }else if (x % x == 0){
            System.out.println("prima");
        }else{
            System.out.println("..");
        }*/
    
    }
}
