package CursoEmVideoPOO.aula09;

import CursoEmVideoPOO.aula02.livro;

public class main {
    public static void main(String[] args){
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];

    p[0] = new Pessoa("joaõ",22,"M");
    p[1] = new Pessoa("maria",23,"F");

    l[0] = new Livro("riquy" ,"josew" , 200, p[0]);
    l[1] = new Livro("dona do lar" ,"mari rose" , 200, p[1]);
    l[2] = new Livro("java basico", "guanabara", 400, p[0]);

        System.out.println(l[2].detalhes());
}
}
