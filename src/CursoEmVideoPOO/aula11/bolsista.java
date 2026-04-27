package CursoEmVideoPOO.aula11;

public class bolsista extends aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("renovando bolsa de " + this.getNome());
    }

    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista. Pagamendo facilitado");
    }


    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
