package mes1.DesafioLoops;
import java.util.Scanner;

public class SomaAcumulada {
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite um número (0 para sair): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            soma += numero;

            System.out.println("Digite outro número (0 para sair): ");
            numero = scanner.nextInt(); // ATUALIZA A VARIÁVEL
        }

        System.out.println("Soma total: " + soma);


            }
        }





