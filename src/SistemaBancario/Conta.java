package SistemaBancario;

import java.util.ArrayList;

public class Conta {
    private String titular;
    private double saldo;
    private int numeroConta;
    private static int contador = 1;


    //metodos
    public void depositar(double valor){
        if (valor > 0){
            this.setSaldo(this.getSaldo() + valor);
        }else{
            System.out.println("Valor negativo");
        }
    }

    public void sacar(double valor){
        if (valor <= this.getSaldo() && valor > 0){
            this.setSaldo(this.getSaldo() - valor);
        }
        if (valor > this.getSaldo()){
            System.out.println("saldo insuficiente");
        } else if (valor < 0) {
            System.out.println("Valor negativo");
        }
    }

    public void transferir(Conta destino, double valor){
        if ( destino == null){
            System.out.println("Conta invalida");
            return;
        }

        if (valor > 0 && valor <= this.getSaldo()){
            sacar(valor);
            destino.depositar(valor);
        }else{
            System.out.println("Tranferência invalido ");
        }

    }

    public void exibirConta(){
        System.out.println("Titular: " + titular + " | Numero da conta " + numeroConta + " | Saldo: " + this.getSaldo());
    }

    public static Conta buscarConta(ArrayList<Conta> contas, int numero){
        for (Conta conta : contas){
            if (conta.getNumeroConta() == numero){
                return conta;
            }
        }
        return null;
    }





    // metodos especiais
    public Conta(String titular) {
        this.saldo = 0;
        this.titular = titular;

        this.numeroConta = contador++;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Conta.contador = contador;
    }
}

