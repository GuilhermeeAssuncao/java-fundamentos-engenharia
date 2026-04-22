package mes1;

public class missaoFinal {
    public static void main(String[] args) {
        int numero = 10;

        boolean dentroIntervalo = numero >= 10 && numero <= 20;
        boolean foraIntervalo = (numero < 10 && numero > 20);

        System.out.println("Dentro intervalo: " + dentroIntervalo);
        System.out.println("Fora intervalo: " + foraIntervalo);
    }
}
