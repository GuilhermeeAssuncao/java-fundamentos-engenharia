package CursoEmVideoPOO.aula05;

public class banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //contrutor
    public banco(boolean status, float saldo) {
        this.status = false;
        this.saldo = 0f;
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

    public void  abrirConta(){
        setTipo(tipo);
        setStatus(true);
        if (tipo.equals("CC")){
            setSaldo(50);
        }
        else if (tipo.equals("CP")){
            setSaldo(150);
        }
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
        }
    }
    public void depositar(float v){
       if ( getStatus() == true){
           setSaldo(getSaldo() + v);
       }else {
           System.out.println("Abra uma conta");
       }
    }

    public void sacar(float v){
        if (getStatus() == true ){
            if(getSaldo() > v){
                setSaldo(getSaldo() - v);
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
        if (tipo.equals("CC")){
            v = 12;
        } else if (tipo.equals("CP")) {
            v = 20;
        }

        if (getStatus() == true){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
            }else  {
                System.out.println("Saldo insuficiente");
            }
        }else  {
            System.out.println("Abra uma conta");
        }
    }
}
