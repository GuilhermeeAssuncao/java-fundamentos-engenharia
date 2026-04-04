package CursoEmVideoPOO.aula05;

public class aula5 {
    public static void main(String[] args) {
        banco b = new banco();
        b.setNumConta(1311);
        b.setDono("juca");
        b.abrirConta("CC");


        banco b2 = new banco();
        b2.setNumConta(1111);
        b2.setDono("cleuza");
        b2.abrirConta("CP");

        b.depositar(300);
        b2.depositar(500);
        b2.sacar(150);

        b.estadoAtual();
        b2.estadoAtual();
    }
}
