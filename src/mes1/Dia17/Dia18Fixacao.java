package mes1.Dia17;

import java.util.HashMap;
import java.util.HashSet;

public class Dia18Fixacao {
    public static boolean temDuplicado(int[] n){
        HashSet<Integer> set = new HashSet<>();
        for (int i : n){
            if (set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static int primeiroDuplicado(int[] n){
        HashSet<Integer> set = new HashSet<>();

        for(int i : n){
            if (set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return -1;
    }

    public static void frequencia(int[] n){
        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i : n){
          map.put(i,  map.getOrDefault(i,0)+1);
        }

        for ( int i : map.keySet()){
            System.out.print(i + " -> " + map.get(i) + ", ");
        }

    }

    public static int[] twoSum(int[] n, int alvo){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0 ; i < n.length; i++){
            int complemento = alvo - n[i];
            if (map.containsKey(complemento)){
                return new int[]{map.get(complemento),i};
            }
            map.put(n[i], i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args){
        int[] n = {2,5,1,2,3,5};
        int[] n2 = {2,7,11,15};
        int alvo = 9;

        System.out.println("tem suplicados: " + temDuplicado(n));
        System.out.println("primeiro duplicados: " + primeiroDuplicado(n));

        int[] resultado = twoSum(n2, alvo);
        System.out.println("two Sum:" + resultado[0] + ", " + resultado[1]);
    }

}
