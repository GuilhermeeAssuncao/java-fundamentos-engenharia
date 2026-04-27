package CursoEmVideoPOO.aula10;

public class main {
    public static void main(String[] args){

        aluno p2 = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();


        p2.setNome("maria");
        p3.setNome("claudio");
        p4.setNome("fabiana");


        p2.setIdade(20);
        p3.setIdade(40);
        p4.setIdade(28);

        p2.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("Informatica");

        p3.setSalario(2500f);

        p4.setSetor("poapelaria");


        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
