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
public class Jabatan extends identitas{
    int gaji = 1500000;
    int bonus = gaji * 2;
    
    @Override
    public void nama () {
        System.out.println("Nama Pegawai \t : " + super.nama);
    }

    @Override
    public void gender () {
        System.out.println("Jenis Kelamin \t : " + super.jenisK);
    }
    public void posisi () {
        System.out.println("In charge of Departmenet of Marketing and Salary");
    }
    public void gaji () {
        System.out.println("Gaji Utama Pegawai \t :" + this.gaji);
    }
    public void bonus () { 
        System.out.println("Gaji Bonus Pegawai \t :" + this.bonus);
    }
}
