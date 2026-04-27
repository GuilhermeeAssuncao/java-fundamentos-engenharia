package CursoEmVideoPOO.aula11;

public class aluno extends Pessoa{
    private int matr;
    private String curso;

    public void PagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
