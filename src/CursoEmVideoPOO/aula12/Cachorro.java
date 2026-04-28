package CursoEmVideoPOO.aula12;

public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("enterrando Osso");
    }

    public void abanarRabo(){
        System.out.println("abanando Rabo");
    }
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU");
    }
}
