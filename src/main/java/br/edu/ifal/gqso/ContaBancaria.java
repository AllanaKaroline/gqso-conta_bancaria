package br.edu.ifal.gqso;

import java.util.Scanner;

public class ContaBancaria {
    private int saques;
    private double saldo;
    private string nome;
    Scanner entrada = new Scanner(System.in);
    
    public ContaBancaria( double saldo_inicial){
        saldo=saldo_inicial;
        saques=0;
    }
    
    public void saldo(){
        System.out.println("\tSALDO");
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
        
    }
    
    public void saque(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void deposito(double valor)
    {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
    
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }
    
    public void exibeMenu(){
        
        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double valor;
        
        switch( opcao ){
            case 1:    
                    saldo();
                    break;
            case 2: 
                    if(saques<3){
                        System.out.print("Quanto deseja sacar: ");
                        valor = entrada.nextDouble();
                        saque(valor);
                    } else{
                        System.out.println("Limite de saques diários atingidos.\n");
                    }
                    break;
                    
            case 3:
                    System.out.print("Quanto deseja depositar: ");
                    valor = entrada.nextDouble();
                    deposito(valor);
                    break;
                    
            case 4: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Opção inválida");
        }
    }
}

