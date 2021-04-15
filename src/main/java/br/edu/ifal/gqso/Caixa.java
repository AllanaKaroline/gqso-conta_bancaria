
package br.edu.ifal.gqso;
import java.util.Scanner;
public class Caixa {
    public static void main(String[] args){
        double inicial;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();
        ContaBancaria Conta = new ContaBancaria( inicial);
        Conta.iniciar();
    }
    
}
