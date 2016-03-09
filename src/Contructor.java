/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructor;

/**
 *
 * @author auliaselma
 */
public class Contructor {

    String nama,nim;
    int lapangan,panjang,lebar, waktu_tercepat,jumlah_putaran,jumlah_waktu,ukuran_lapangan;

    public void display(){
       System.out.println(nim + "  "+nama +"   "  + lapangan   +  "  ");
        
    }
 
   public int ukuran_lapangan(){
       this.lapangan=2*(panjang+lebar)*jumlah_putaran;
       return lapangan;
   }

    public void pemenang(){
        System.out.println(jumlah_putaran/jumlah_waktu);
}
}
