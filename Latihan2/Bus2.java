/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL2.Latihan2;

/**
 *
 * @author surga 2019
 */
public class Bus2 {
   private int penumpang;
   private int maxpenumpang;
   
   public Bus2(int maxpenumpang){
       this.maxpenumpang = maxpenumpang;
       penumpang = 6;
   }
   public void addpenumpang(int penumpang){
       int temp ;
       temp = this.penumpang+penumpang;
       if(temp >= maxpenumpang){
           System.out.println("penumpang melebihi kuota");
       }else {
           this.penumpang = temp;
       }
   }
   public void cetak(){
      System.out.println("penumpang Bus sekarang adalah"+penumpang);
      System.out.println("penumpang maksimum seharusnya adalah"+maxpenumpang);
   }
}
