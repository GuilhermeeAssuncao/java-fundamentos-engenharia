package CursoEmVideoPOO.aula05;

public class banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //contrutor
    public banco() {
        this.setStatus(false);
        this.setSaldo(0);
    }


    // Getter e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

  // metodo

    public void estadoAtual(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }

    public void  abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if (tipo.equals("CC")){
            setSaldo(50);
        }
        else if (tipo.equals("CP")){
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("CONTA COM SALDO");
        }
        else if (getSaldo() < 0 ){
            System.out.println("CONTA ESTÁ EM DEBITO");
        }
        else {
            setStatus(false);
            System.out.println("Conta Fechada com sucesso");
        }
    }

    public void depositar(float v){
       if ( getStatus() == true){
           this.setSaldo(this.getSaldo() + v);
           System.out.println("deposito realizado na conta de " + this.getDono());
       }else {
           System.out.println("Abra uma conta");
       }
    }

    public void sacar(float v){
        if (getStatus() == true ){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this. getDono());
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Abra uma conta");
        }
    }

    public void pagarMensal(){
        float v =0;
        if (this.tipo.equals("CC")){
            v = 12;
        } else if (this.tipo.equals("CP")) {
            v = 20;
        }

        if (this.getStatus() == true){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso");
            }else  {
                System.out.println("Saldo insuficiente");
            }
        }else  {
            System.out.println("Abra uma conta");
        }
    }
}
