package mes2_ESTRUTURA.semana1.dia3;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    // metodos especiais


    public ContaBancaria(String titular,int numeroConta) {
        this.titular = titular;
        this.saldo = 0;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    // metodos

    public void depositar(double v){
        if ( v > 0){
            this.saldo += v;
            System.out.println("Depositado com sucesso");
        }else {
            System.out.println("ERRO: valor negativo");
        }
    }

    public boolean sacar(double v){
        if (v < 0 ){
            System.out.println("Valor negativo");
        }else if (v > this.saldo){
            System.out.println("Saldo insuficiente");
        }
        if (v <= this.saldo && v > 0){
            this.saldo -= v;
            System.out.println("Saque realizado");
            return true;
        }
        return false;
    }

    public void tranferir(double v,ContaBancaria conta){
        if (sacar(v)){
            conta.depositar(v);
            System.out.println("Transferencia realizada com sucesso");
        }
    }
}
