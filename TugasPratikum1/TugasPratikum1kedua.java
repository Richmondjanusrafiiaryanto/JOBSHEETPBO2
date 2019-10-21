/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL2.TugasPratikum1;

/**
 *
 * @author surga 2019
 */
public class TugasPratikum1kedua {
    public static void main(String[] RJR) {
        TugasPratikum1 busbesar = new TugasPratikum1(100);
        busbesar.cetak();
        
       busbesar.addpenumpang(11);
       busbesar.getAverage(42.5);
       busbesar.cetak();
       
       busbesar.addpenumpang(5);
       busbesar.getAverage(41.5);
       busbesar.cetak();
    }
}
