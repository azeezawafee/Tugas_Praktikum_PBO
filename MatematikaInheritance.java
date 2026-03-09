/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Wafiq Azizah
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        Matematika2 m = new Matematika2();
        
        System.out.println("Pertambahan     : 20 + 10 = " + mtk.pertambahan(20,10));
        System.out.println("Pengurangan     : 10 - 5 = " + mtk.pengurangan(10,5));
        System.out.println("Perkalian       : 10 * 3 = " + mtk.perkalian(10,3));
        System.out.println("Pembagian       : 21 / 2 = " + mtk.pembagian(21,2));
        System.out.println("Modulus         : 21 % 2 = " + m.modulus(21,2));
    }
}
