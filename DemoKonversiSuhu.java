/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Wafiq Azizah
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 ks = new KonversiSuhu2();
        
        double celcius = 25;
        double fahrenheit = ks.celciusToFahrenheit(celcius);
        
        System.out.println("Celcius ke Fahrenheit   : " + fahrenheit);
        System.out.println("Celcius ke Reamur       : " + ks.celciusToReamur(celcius));
        System.out.println("Fahrenheit ke Reamur    : " + ks.fahrenheitToReamur(fahrenheit));
    }
}