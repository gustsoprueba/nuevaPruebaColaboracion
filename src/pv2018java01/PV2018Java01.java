/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018java01;

import calculadora.Calculadora;

/**
 *
 * @author gustso
 */
public class PV2018Java01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numA = 5;
        int numB = 5;
        Calculadora casio = new Calculadora();
        casio.recibirNumero(numA,numB);
        System.out.println("El resultado es: " + casio.sumar());
        System.out.println("El resultado es: " + casio.realizarPotencia());
        System.out.println("El resultado es: " + casio.factorial());
    }
    
}
