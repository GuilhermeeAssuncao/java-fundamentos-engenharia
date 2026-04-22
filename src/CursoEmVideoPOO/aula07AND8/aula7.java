package CursoEmVideoPOO.aula07AND8;

public class aula7 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] =  new Lutador("Pretty Boy", "França", 31, 1.75f
        , 68.9f, 11,2,1);
        l[1] = new Lutador("Putscript" , "Brasil",
                29, 1.68f,57.8f,14,2,3);
        l[2] = new Lutador("Snapshadow" , "EUA"
                , 35,1.65f,80.9f,12,2,1);
        l[3] = new Lutador("Dead Code" , " Australia",
                28, 1.96f,81.6f, 13,0,2);
        l[4] = new Lutador( "Cobol" , "Brasil",
                37, 1.71f, 119.3f, 5,4,3);
        l[5] = new Lutador ("Nerdaa" , "EUA",
                30, 1.81f,105.7f,12,2,4);

        Luta ufc = new Luta();
        ufc.marcarLuta(l[1], l[0]);
        ufc.lutar();
    }
}
