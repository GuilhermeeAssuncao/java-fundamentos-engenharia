package mes1;

import java.util.Arrays;

public class Dia33 {

    public static int[] twoSum(int[] n){
        int left = 0;
        int right = n.length - 1;
        int alvo = 9;


        while (left < right){
            int soma =  n[left] + n[right];
            if (soma == alvo){
                return new int[]{left,right};
            }
            if (soma > alvo){
                right--;
            }
            if (soma < alvo){
                left++;
            }
        }


        return null;
    }

    public static int kadane(int[] k){
        int max = k[0];
        int maiorAtual = k[0];


        for (int i = 1; i < k.length; i++) {
            maiorAtual = Math.max(k[i], maiorAtual + k[i]);

            // atualiza o maior
            if (maiorAtual > max) {
                max = maiorAtual;
            }

        }

        return max;
    }

    public static void main(String[] args){
        int[] n = {2,3,4,7,11};
        int[] k = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        System.out.println(Arrays.toString(twoSum(n)));
        System.out.println(kadane(k));


    }
}
