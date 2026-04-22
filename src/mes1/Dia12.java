package mes1;

import java.util.Scanner;

public class Dia12 {
    public static boolean existeNumero(int[] n, int valor){
        boolean existe = false;

        for (int i = 0; i < n.length; i++){
            if (n[i] == valor){
                existe = true;
            }
        }

        return existe;
    }

    public static int posicaoMaior(int[] n){
        int maior = 0;
        int posicao = 0;

        for (int i = 1; i < n.length; i++){
            if (n[i] > maior) {
                maior = n[i];
                posicao = i;
            }
        }
        return posicao;
    }

    public static boolean temDuplicado(int[] n){


        for ( int i = 1; i < n.length; i++){
            for ( int j = i +1 ; j < n.length; j++){
                if (n[i] == n[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] n = {1,4,7,4};
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero a comparar:");
        int valor = sc.nextInt();
        System.out.println("O valor comparado existe neste Array: " + existeNumero(n, valor));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("O maior valor está na posição: " + posicaoMaior(n));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("esta array tem duplicata: " + temDuplicado(n));


    }
}
