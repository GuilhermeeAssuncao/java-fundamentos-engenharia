package mes1;

import java.util.HashMap;
import java.util.HashSet;

public class Dia27 {

    public static int numUnico(int [] n){
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i : n){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)==1){
                return i;
            }
        }

        return -1;
    }

    public static int numMaisFrequente(int[] n){
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i : n){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int maiorFreq = 0;
        int numMaisFreq = 0;

        for(int i : map.keySet()){
            if(map.get(i) > maiorFreq ){
                maiorFreq = map.get(i);
                numMaisFreq = i;
            }
        }

        return numMaisFreq;
    }

    public static int primeiroRep(int[] n){
        HashSet<Integer> set = new HashSet<>();
        for( int i : n){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] n = {4,1,2,1,2,4,5,4};

        System.out.println(numUnico(n));
        System.out.println(numMaisFrequente(n));
        System.out.println(primeiroRep(n));
    }
}
