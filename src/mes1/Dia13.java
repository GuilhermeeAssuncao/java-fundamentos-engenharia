package mes1;

public class Dia13 {

        public static int segundoMaior(int[] n1){
            int maior = Integer.MIN_VALUE;
            int segundoMaior = Integer.MIN_VALUE;

            for (int i = 0; i < n1.length; i++){
                if (n1[i] > maior){
                    segundoMaior = maior;
                    maior = n1[i];
                }else if (n1[i] > segundoMaior && n1[i] != maior){
                    segundoMaior = n1[i];
                }
            }
            return segundoMaior;
        }

        public static void inverterArray(int[] n2){
            for  (int i = 0; i < n2.length / 2; i++){

                    int temp = n2[i];
                    n2[i] = n2[n2.length - 1 - i];
                    n2[n2.length - 1 - i] = temp;
            }
            for (int j : n2) {
                System.out.print(j + " ");
            }

        }

        public static boolean ehPalindromo(int[] n3){

                for (int i = 0; i < n3.length / 2; i++){

                    if (n3[i] != n3[n3.length - 1 - i]){
                        return false;
                    }
            }
            return true;
        }

        public static void main(String[] args){
            int[] n1 = {11,2,9,4,10};
            int[] n2 = {1,2,3,4,5};
            int[] n3 = {1,2,3,2,1};

            System.out.println("o segundo maior numero é: " + segundoMaior(n1));
            inverterArray(n2);
            System.out.println(" ");
            System.out.println("é um palindromo: " + ehPalindromo(n3));
        }
}
