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
public class MultiplicacaoTeste {
    public void testarMultiplicacao(){
        Multiplicacao mult = new Multiplicacao();
        
        //Multiplicação com os dois valores inteiros e positivos
        System.out.println(mult.multiplicar(1, 1));
        
        //Multiplicação com o primeiro valor inteiro e positivo e o segundo negativo
        System.out.println(mult.multiplicar(1, -1));
        
        //Multiplicação com o primeiro valor inteiro e negativo e o segundo positivo
        System.out.println(mult.multiplicar(-1, 1));
        
        //Multiplicação com os dois valores inteiros e negativos
        System.out.println(mult.multiplicar(-1, -1));
        
        //Multiplicação com o primeiro valor zerado
        System.out.println(mult.multiplicar(0, 1));
        
        //Multiplicação com o segundo valor zerado
        System.out.println(mult.multiplicar(1, 0));
        
        //Multiplicação com os dois valores zerados
        System.out.println(mult.multiplicar(0, 0));
        
        //Multiplicação com os dois valores > 100
        System.out.println(mult.multiplicar(150, 150));
        
        //Multiplicação com os dois valore < 100
        System.out.println(mult.multiplicar(-150, -150));
    }
}
