import java.awt.*;
import java.util.Arrays;

public class Dia16 {

    public static int[] prefixSum(int[] n){
        int[] pre= new int[n.length];
        pre[0] = n[0];

        for ( int i =1; i < n.length; i++){
            pre[i] = pre[i-1] + n[i];
        }
        return pre;
    }

    public static int somaIntervalo(int[] prefix, int l, int r){
        if (l == 0){
            return prefix[r];
        }
         return prefix[r] - prefix[l-1] ;
    }

    public static int maiorSomaSub(int[] n2, int k){
        int soma = 0;

        for ( int i = 0; i < k; i++){
            soma += n2[i];
        }

        int max = soma;
        for (int i =k; i < n2.length; i++){

            soma = soma - n2[i -k] + n2[i];
            if (soma > max){
                max = soma;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] n = {2,4,6,3,5};
        int[] prefix = prefixSum(n);
        int l = 1, r = 3;
        int[] n2 = {2,1,5,1,3,2};
        int k = 3;

        System.out.print(Arrays.toString(prefixSum(n)));
        System.out.println(' ');
        System.out.println("----------------------------------------------- ");
        System.out.println(somaIntervalo(prefix, 1, 3));
        System.out.println("----------------------------------------------- ");
        System.out.println(maiorSomaSub(n2, k));

    }
}
