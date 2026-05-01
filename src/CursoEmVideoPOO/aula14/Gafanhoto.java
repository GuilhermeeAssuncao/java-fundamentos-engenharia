package CursoEmVideoPOO.aula14;

public class Gafanhoto extends Pessoa {
    private int totAssistido;
    private String login;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    @Override
    protected void ganharExperiencia() {
        this.experiencia++;
    }

    public void viuMaisUm(){
        this.totAssistido++;
    }

    //metodos especiais


    @Override
    public String toString() {
        return "Gafanhoto{" +
                "totAssistido=" + totAssistido +
                ", login='" + login + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
