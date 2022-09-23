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
public class SubtracaoTeste {
    public void testarSubtracao(){
        Subtracao sub = new Subtracao();
        
        //Subtração com os dois números inteiros e positivos
        System.out.println(sub.subtrair(1, 1));
        
        //Subtração com o primeiro número inteiro e positivo e o segundo negativo
        System.out.println(sub.subtrair(1, -1));
        
        //Subtração com o primeiro número inteiro e negativo e o segundo positivo
        System.out.println(sub.subtrair(-1, 1));
        
        //Subtração com os dois número inteiros e negativos
        System.out.println(sub.subtrair(-1, -1));
        
        //Subtração com o primeiro valor zerado
        System.out.println(sub.subtrair(0, 1));
        
        //Subtração com o segundo valor zerado
        System.out.println(sub.subtrair(1, 0));
        
        //Subtração com os dois valores zerados
        System.out.println(sub.subtrair(0, 0));
        
        //Subtração com os dois números > 100
        System.out.println(sub.subtrair(150, 150));
        
        //Subtração com os dois números < 100
        System.out.println(sub.subtrair(-150, -150));
    }
}
