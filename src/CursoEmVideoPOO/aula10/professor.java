package CursoEmVideoPOO.aula10;

public class professor extends Pessoa {
    private String especialidade;
    private double salario;

    // metodos
    public void receberAume(int aumento){
        this.salario = this.getSalario() + aumento;
    }

    //metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
