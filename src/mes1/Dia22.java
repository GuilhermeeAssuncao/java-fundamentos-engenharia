package mes1;

import java.util.HashMap;
import java.util.HashSet;


public class Dia22 {
    public static int contarUnicos(int[] n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i: n){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int contador = 0;

        for(int i : map.keySet()){

            if (map.get(i) ==1){
                contador++;
            }

        }

        return contador;
    }

    public static boolean arraysIguais(int[] n, int[] k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : n){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i : k ){
            if (!map.containsKey(i)){
                return false;
            }
            map.put(i,map.get(i)-1);
            if (map.get(i)==0){
                map.remove(i);
            }
        }

        return map.isEmpty();
    }

    public static void intersecaoSemDuplicados(int[] n, int[] k){
        HashSet<Integer> set = new HashSet<>();

        for (int i : n){
            set.add(i);
        }
        for (int i : k){
            if (set.contains(i)){
                set.remove(i);
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] n = {1,2,2,3,4,4};
        int[] k = {2,2,1,3,4,5};

        System.out.println("Temos " + contarUnicos(n) + " numeros unicos.");
        System.out.println("são iguais: " + arraysIguais(n,k));
        intersecaoSemDuplicados(n,k);
    }
}
