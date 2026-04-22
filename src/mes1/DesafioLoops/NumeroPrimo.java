package mes1.DesafioLoops;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um número : ");
        num = scanner.nextInt();


        if (num <= 1) {
            System.out.println(false);
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(false); // conseguiu dividir certinho
            }else {
                System.out.println(true);
            }
        }


    }

}
