/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Luis
 */
public class SomaTeste {
    public void testarSoma(){
        Soma s = new Soma();
        
        //Soma de dois números inteiros e positivos
        System.out.println(s.somar(1, 1));
        
        //Soma de um número inteiro positivo e 0
        System.out.println(s.somar(0, 1));
        
        //Soma de dois número zerados
        System.out.println(s.somar(0, 0));
        
        //Soma de um número inteiro positivo e um negativo
        System.out.println(s.somar(1, -1));
        
        //Soma de dois número inteiros negativos
        System.out.println(s.somar(-1, -1));
        
        //Soma de dois números > 100
        System.out.println(s.somar(150, 150));
        
        //Soma de dois números < -100
        System.out.println(s.somar(-150, -150));
    }
}
