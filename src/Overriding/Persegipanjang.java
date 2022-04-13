/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Panda PC
 */
public class Persegipanjang  extends BangunDatar { 
float panjang,lebar; 
//size data float lebih kecil dari pada double

public void luas(){
float luas=panjang*lebar; //deklarasi
System.out.println("Luas Persegi panjang = " + luas);
}

@Override
public void keliling(){
float keliling=2*(panjang+lebar); 
System.out.println("Keliling Persegi panjang = " + keliling);
}
}

