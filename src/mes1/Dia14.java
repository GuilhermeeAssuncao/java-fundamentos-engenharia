package mes1;

import java.util.Scanner;

public class Dia14 {
    public static int buscaLinear(int[] n, int valor){
        int numeroBuscado = -1;
        for( int i = 0; i < n.length  ; i++){
            if (n[i] == valor) {
                numeroBuscado = i;
                break;
            }
        }


        return numeroBuscado;

    }

    public static int contarOcorrencias(int[] n2, int valor){
        int contador = 0;
        for( int i = 0; i< n2.length; i++){
            if (n2[i] == valor){
                contador++;
            }
        }
        return contador;
    }

    public static int buscaBinaria(int[] n3, int valor){
        int inicio = 0;
        int fim = n3.length -1;

        while (inicio <= fim){
            int meio = (inicio + fim) /2;

            if ( n3[meio] == valor){
                return meio;
            }
            if (valor > n3[meio]){
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int [] n = {4,7,2,9,5};
        int [] n2 = {2,5,2,8,2};
        int [] n3 = {1,3,5,7,9,11};
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero para busca: ");
        int valor = sc.nextInt();
        System.out.println("O valor esta em  " + buscaLinear(n, valor));
        System.out.println("-------------------------------------------");
        System.out.println("O " + valor + " apareceu " + contarOcorrencias(n2, valor) + " vezes.");
        System.out.println("-------------------------------------------");
        int posicao = buscaBinaria(n3, valor);

        System.out.println("Encontrado no índice: " + posicao);
    }
}
