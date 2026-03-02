import java.util.Scanner;

public class diasDaSemana {
    public static void main(String[] args){

        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Dia inválido");
        }

    }
}
