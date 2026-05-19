package CursoEmVideoPOO.aula14;

public class Main {
    public static void main(String[] args){
        Video v[] = new Video[3];

        v[0] = new Video("POO");
        v[1] = new Video("java");
        v[2] = new Video("engenharia");

        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("gsta",12,"M","GUSTAfav");
        g[1] = new Gafanhoto("jubata", 21, "M","jujuba");

        Visualizacao vis[] = new Visualizacao[3];

        vis[0] = new Visualizacao(g[1],v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[1],v[1]);
        vis[1].avaliar(90.0f);
        System.out.println(vis[1].toString());

//        System.out.println(g[0].toString());
//        System.out.println(v[0].toString());
        System.out.println(vis.toString());
    }
}
