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
public class Bus3 {

    public int penumpang;
    public int maxpenumpang;

    public Bus3(int penumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > penumpang) {
            System.out.println("Penumpang melebihi kouta");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(int Password) {
        if (Password == 24) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }

    public void cetak() {
        System.out.println("Jumlah penumpang sekarang:" + penumpang);
        System.out.println("Maksimal jumlah penumpang:" + maxpenumpang);
    }
}
