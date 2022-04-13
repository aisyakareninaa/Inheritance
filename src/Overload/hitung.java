/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overload;
//Dalam satu class yang kita buat, 
//kadangkala kita menginginkan untuk membuat method dengan nama yang sama namun mempunyai 
//fungsi yang berbeda menurut parameter yang digunakan. Kemampuan ini dimungkinkan dalam 
//pemrograman Java, dan dikenal sebagai overloading method.


/**
 *
 * @author Panda PC
 */
public class hitung {
    public static void main(String[] args) {
BangunDatar hitunglah=new BangunDatar(); //objek 

hitunglah.luas(2, 5, 6);
hitunglah.luas(3.5, 6.9);

}
}
