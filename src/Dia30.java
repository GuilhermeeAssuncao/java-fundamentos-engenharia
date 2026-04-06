import ArraysIntermediario.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Dia30 {

    public static int[] twosun(int[] n ){
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = 9;
        for (int i = 0 ; i < n.length; i++){
            int compl = m - n[i];
            if (map.containsKey(compl)){
                return new int[]{map.get(compl),i} ;
            }
            map.put( n[i], i);


        }


        return null;
    }

    public static boolean verificaDuplicado(int[] d){
        HashSet<Integer> set = new HashSet<>();

        for ( int i : d){
            if (set.contains(i)){
                return true;
            }
            set.add(i);
        }

        return false;
    }

    public static void intersecao(int[] a, int[] b){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : a){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }


        ArrayList<Integer> list = new ArrayList<>();
        for (int i : b){
            if (map.containsKey(i) && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        System.out.println(list);


    }

    public static void main (String[] arsg){
        int []n = {2,7,11,15};

        int [] d = {1,2,3,1};
        int [] a ={4,9,5};
        int [] b = {9,4,9,8,4};


        System.out.println(twosun(n));
        System.out.println(verificaDuplicado(d));
        intersecao(a,b);
    }
}
