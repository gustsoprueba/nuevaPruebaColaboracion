/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author gustso
 */
public class Calculadora {
    int numA;
    int numB;
    
    public void recibirNumero(int A, int B){
        numA = A;
        numB = B;
        agregarNum(numA,numB);
    }
    
    private void agregarNum(int A, int B){
        numA = A + 1;
        numB = B +1;
    }
    
    public int sumar(){
        int resultado;
        resultado = numA + numB;
        return resultado;
    }
    
    public double realizarPotencia(){
        double resultado = 1;
        for (int i = 1; i <= numB; i++){
            resultado = resultado * numA;
        }
        return resultado;
    }
    
    public int factorial(){
        int resultado = 1;
        for (int i = 1; i <= numB; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
}
