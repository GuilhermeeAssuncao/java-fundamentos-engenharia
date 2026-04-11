public class Dia34 {

    public static int maxSomaJanela(int[] n, int k){
        int soma = 0;

        for(int i = 0; i < k; i ++){
            soma += n[i];
        }

        int max = soma;

        for (int i = k; i < n.length;i++){
            soma = soma - n[i - k];
            soma = soma + n[i];

            if (soma > max ){
                max = soma;
            }
        }


        return max;
    }

    public static int menorSomaJanela(int[] n, int k){
        int soma = 0;

        for (int i =0; i < k;i++){
            soma += n[i];
        }
        int min = soma;

        for (int i = k;i < n.length; i++){
            soma = soma - n[i -k];
            soma = soma + n[i];

            if ( soma < min){
                min = soma;
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] n = {2, 1, 5, 1, 3, 2};
        int k = 3;


        System.out.println(maxSomaJanela(n, k));
        System.out.println(menorSomaJanela(n, k));
    }
}
