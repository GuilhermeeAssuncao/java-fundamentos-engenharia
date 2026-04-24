package CursoEmVideoPOO.aula10;

public class main {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        aluno p2 = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();

        p1.setNome("pedro");
        p2.setNome("maria");
        p3.setNome("claudio");
        p4.setNome("fabiana");

        p1.setIdade(21);
        p2.setIdade(20);
        p3.setIdade(40);
        p4.setIdade(28);


    }
}
