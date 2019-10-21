/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL2.Latihan4;

/**
 *
 * @author surga 2019
 */
public class UjiBus3 {

    public static void main(String[] args) {
        Bus3 Bus = new Bus3(10);
        Bus.maxpenumpang = 25;
        Bus.addpenumpang(10);
        Bus.getpenumpang(24);
        Bus.cetak();
        Bus.penumpang = Bus.penumpang + 9;
        Bus.cetak();
        Bus.penumpang = Bus.penumpang + 10;
        Bus.cetak();
    }
}
