/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan50.energikinetik;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mengitung energi kinetik
 */
public class PBO210117061Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Energi ene = new Energi();
        ene.setMassa(145);
        ene.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa = " + ene.getMassa() + " g");
        System.out.println("Bola baseball terssebut dilempar dengan kecepatan = " + ene.getKecepatan() + " m/s");

        double massa = ene.getMassa();
        double kecepatan = ene.getKecepatan();

        System.out.println("A. Energi Kinetik = " + ene.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + ene.usaha());
        System.out.println("P.S : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }

}
