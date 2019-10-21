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
public class UjiBus2 {
    public static void main(String[] args) {
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        busBesar.addpenumpang(18);
        busBesar.cetak();
        
        busBesar.addpenumpang(5);
        busBesar.cetak();
        
        busBesar.addpenumpang(26);
        busBesar.cetak();
    }
    
}
