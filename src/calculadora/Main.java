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
public class Main {
    
    public static void main(String[] args) {
        SomaTeste somT = new SomaTeste();
        somT.testarSoma();
        
        SubtracaoTeste subT = new SubtracaoTeste();
        subT.testarSubtracao();
        
        MultiplicacaoTeste multT = new MultiplicacaoTeste();
        multT.testarMultiplicacao();
        
        DivisaoTeste divT = new DivisaoTeste();
        divT.testarDivisao();
    }
}
