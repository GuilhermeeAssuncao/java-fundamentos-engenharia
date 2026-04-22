package mes1;

import java.util.HashMap;
import java.util.HashSet;

public class Dia29 {

    public static int naoRepete(int[] n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for ( int i : n){
            map.put(i, map.getOrDefault(i,0)+1);

        }

        for (int i : n){
            if (map.get(i) == 1){
                return i;
            }
        }


        return -1;
    }

    public static int primeiroRepetido(int[] n){
        HashSet<Integer> set =new HashSet<>();

        for (int i : n){
            if (set.contains(i)){
                return i;
            }
            set.add(i);
        }

        return -1;
    }

    public static void main(String[] args){
        int[] n = {1,2,3,2,1};

        System.out.println(naoRepete(n));
        System.out.println(primeiroRepetido(n));
    }
}
