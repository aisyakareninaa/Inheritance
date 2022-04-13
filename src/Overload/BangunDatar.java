/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overload;

/**
 *
 * @author Panda PC
 */
public class BangunDatar { //deklarasi menggunakan modifier public, nama method BangunDatar
double luas; //variable
double a=0.5;

void luas(double panjang , double lebar){ luas = panjang*lebar; //berisi parameter
System.out.println("luas pertama = "+luas);
}
void luas(int panjang, int lebar, int a){ luas= panjang * lebar*a; //berisi parameter
System.out.println("luas kedua = "+luas);
}
} 