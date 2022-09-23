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
public class DivisaoTeste {
    public void testarDivisao(){
        Divisao div = new Divisao();
        
        //Divisão com os dois valores inteiros e positivos
        System.out.println(div.dividir(1, 1));
        
        //Divisão com o primeiro valor inteiro e positivo e o segundo negativo
        System.out.println(div.dividir(1, -1));
        
        //Divisão com o primeiro valor inteiro e negativo e o segundo positivo
        System.out.println(div.dividir(-1, 1));
        
        //Divisão com os dois valores inteiros e negativos
        System.out.println(div.dividir(-1, -1));
        
        //Divisão com o primeiro valor zerado
        System.out.println(div.dividir(0, 1));
        
        //Divisão com os dois valores > 100
        System.out.println(div.dividir(150, 150));
        
        //Divisão com os dois valores < 100
        System.out.println(div.dividir(-150, -150));
        
        //Divisão com números não multiplos
        System.out.println(div.dividir(130, 40));
    }
}
