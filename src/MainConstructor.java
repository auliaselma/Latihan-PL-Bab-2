/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author auliaselma
 */
public class MainConstructor {
    public static int i;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        Scanner in4 = new Scanner(System.in);
        Scanner in5 = new Scanner(System.in);
        Scanner in6 = new Scanner(System.in);
        Scanner in7 = new Scanner(System.in);
       int a;
      
         Contructor con=new Contructor();
          
        System.out.print("jumlah mahasiswa    :");
         a=in.nextInt();
          System.out.print("panjang lapangan :");
            con.panjang=in5.nextInt();
            System.out.print("lebar lapangan   :");
            con.lebar=in6.nextInt();
        
        Contructor cons[]=new Contructor[a];
       
       
  
        for(i=0;i<cons.length;i++){
            cons[i] = new Contructor();
            
            System.out.print("NIM       :");
            cons[i].nim=in.next();
            System.out.print("Nama      :");
            cons[i].nama=(in2.nextLine());
            System.out.print("jumlah putaran    :");
            cons[i].jumlah_putaran=(in3.nextInt());
            System.out.print("waktu   :");
            cons[i].jumlah_waktu=(in4.nextInt());
            
           
            System.out.println("========================================================");
             
                     
              
        }
        
        for(int i=0;i<cons.length;i++){
            cons[i].display();
             
        }
   
   }
  
     
  }
    
        
    

