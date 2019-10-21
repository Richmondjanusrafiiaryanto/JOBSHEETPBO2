/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL2.Latihan3;

/**
 *
 * @author surga 2019
 */
public class TestSiswa2 {
    public static void main(String[] args) {
        
        TestSiswa siswa = new TestSiswa();
        siswa.setName("Richmond");
        siswa.setAge(15);
        siswa.setAddress("Sidoarjo");
        
        System.out.println("Name :"+siswa.getName());
        System.out.println("Age :"+siswa.getAge());
        System.out.println("Address :"+siswa.getAddress());
    }
    
}
