package CursoEmVideoPOO.aula14;

public class main {
    public static void main(String[] args){
        Video v[] = new Video[3];

        v[0] = new Video("POO");
        v[1] = new Video("java");
        v[2] = new Video("engenharia");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("gsta",12,"M","GUSTAfav");
        g[1] = new Gafanhoto("jubata", 21, "M","jujuba");


        System.out.println(g[0].toString());
        System.out.println(v[0].toString());
    }
}
