package mes1;

import java.util.HashMap;

public class Dia20 {

    public static int numeroMaisFrequente(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }

        int frequente = nums [0];
        int max = 0;
        for(int i : map.keySet()){
            if(map.get(i)>max){
                max = map.get(i);
                frequente = i;
            }
        }


        return frequente;
    }

    public static int primeiroNaoDuplicado(int[] n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : n){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int[] nums = {1,2,2,2,3,3};
        int[] n = {2,5,1,2,1,3,4,3,5};


        System.out.println(numeroMaisFrequente(nums));
        System.out.println("o NUMERO UNICO  é: " + primeiroNaoDuplicado(n));
    }
}
