package CursoEmVideoPOO.aula10;

public class funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    //metodos
    public void mudarTrab(){
       this.trabalhando = !this.trabalhando;
    }

    //metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
