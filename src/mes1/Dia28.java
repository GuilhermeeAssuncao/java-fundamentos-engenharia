package mes1;

import java.util.HashMap;

public class Dia28 {

    public static boolean anagrama(int[] n,int[] n2){
        HashMap<Integer,Integer> map = new HashMap<> ();
        if(n.length != n2.length){
            return false;
        }

        for(int i : n){
            map.put(i, map.getOrDefault(i,0) +1);
        }
        for(int i : n2){
            if(!map.containsKey(i)||map.get(i) == 0){
                return false;
            }
            map.put(i,map.get(i)-1);
        }

        return true;
    }
    public static void main(String[] args){
        int[] n = {2,1,2,3};
        int[] n2 = {1,3,2};

        System.out.println(anagrama(n,n2));

    }
}
