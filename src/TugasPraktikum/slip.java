/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Panda PC
 */
public class slip {
    public static void main (String [] args) {
        identitas pegawai = new identitas ();
        pegawai.intro();
        
        Jabatan karyawan = new Jabatan ();
        karyawan.nama();
        karyawan.gender();
        karyawan.posisi();
        karyawan.gaji();
        karyawan.bonus();
    }
}
