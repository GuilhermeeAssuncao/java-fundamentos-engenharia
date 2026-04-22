package mes1;

import java.util.Arrays;
import java.util.HashMap;

public class revisãodia32 {

    public static int[] twosum ( int[] n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int alvo = 8;
        int target =0;

        for (int i =0 ; i < n.length; i++){
            target = alvo - n[i];

            if (map.containsKey(target)){
                return new int[]{map.get(target),i};
            }
            map.put(n[i],i);
        }



        return null;
    }

    public static int kadane ( int[] k){
        int soma =0;
        int max= 0;

        for (int i =0 ; i < k.length; i++){
            soma += k[i];

            if (soma > max){
                max = soma;
            }
            if (soma < 0){
                soma = 0;
            }

        }

        return max;
    }
    public static void main(String[] args) {
        int [] k= {-1,2,3,-5,4};
        int[] n= {1,5,3,7};

        System.out.println(Arrays.toString(twosum(n)));
        System.out.println(kadane(k));
    }
}
