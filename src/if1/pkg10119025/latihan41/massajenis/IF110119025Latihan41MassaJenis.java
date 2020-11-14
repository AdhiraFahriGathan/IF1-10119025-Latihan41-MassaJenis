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
public class IF110119025Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
		kubus.setSisi(5);
		kubus.setMassa(250);
		int volume = kubus.hitungVolume(kubus.getSisi());
		int massaJenis = kubus.hitungMassaJenis(volume, kubus.getMassa());
	    System.out.println("======Massa Jenis Kubus======");
	    System.out.println("Sisi : " + kubus.getSisi());
	    System.out.println("Massa : " + kubus.getMassa());
		System.out.println("======Hasil Perhitungan======");
		System.out.println("Volume : " + volume);
		System.out.println("Massa Jenis : " + massaJenis);
    }
}
