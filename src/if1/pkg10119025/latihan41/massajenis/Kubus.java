/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan41.massajenis;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Massa Jenis
 */
public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi(){
        return sisi;
    }

    public void setSisi(int sisi){
        this.sisi = sisi;
    }

    public int getMassa(){
        return massa;
    }

    public void setMassa(int massa){
        this.massa = massa;
    }

    public int hitungVolume(int parSisi){
        return (int) Math.pow(parSisi, 3);
    }

    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa / volume;
    }
}

