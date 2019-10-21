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
public class TugasPratikum1 {

    private double penumpang;
    private double maxpenumpang;
    private double Average;

    public TugasPratikum1(int makspenumpang) {
        this.maxpenumpang = makspenumpang;
        penumpang = 5;
        Average = 65;
    }

    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Penumpang melebihi kuota,MOHON MAAF");
        } else {
            this.penumpang = (double) temp;
        }
    }

    public double getAverage(double Average) {
        double temp;
        temp = (double) (this.Average + Average);
        if (temp < Average) {
            System.out.println("Berat rata-rata penumpang:");
        } else {
            this.Average = (double) temp;
        }
        return Average;
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang:" + penumpang);
        System.out.println("Jumlah maksimal bus:" + maxpenumpang);
        System.out.println("Berat rata-rata penumpang:" + Average + "Kg");
    }
}
