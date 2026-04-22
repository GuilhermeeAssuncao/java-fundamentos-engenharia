package mes1;

import java.util.HashMap;
import java.util.HashSet;

public class Dia23 {
    public static boolean saoUnicos(int[] n ){
        HashSet<Integer> set = new HashSet<>();
        for(int i : n){
            if (set.contains(i)){
                return false;
            }
            set.add(i);
        }

        return true;
    }

    public static int somarElementosUnicos( int[] n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int soma = 0;

        for(int i : n){
            map.put(i,map.getOrDefault(n[i],0)+1);
        }
        for( int i : map.keySet()){
            if(map.get(i) == 1)
                soma += i;
        }
        return soma;
    }

    public static int primeiroRepetido(int[] n){
        HashSet<Integer> set = new HashSet<>();

        for(int i : n){
            if( set.contains(i)){
                return i;
            }
            set.add(i);
        }

        return -1;
    }

    public static boolean mesmaFrequencia(int[] n, int[] b){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : n){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : b){
            if (!map.containsKey(i)){
                return false;
            }
            map.put(i,map.getOrDefault(i,0)-1);
            if(map.get(i) == 0){
                map.remove(i);
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args){
        int[] n = {4,2,3,1,5,6,6};
        int[] b = {1,2,3,4,5,6,6};

        System.out.println("nesta array tem duplicados: " + saoUnicos(n));
        System.out.println("A soma dos inteiros é: " + somarElementosUnicos(n));
        System.out.println("o primeiro numero repetido: " + primeiroRepetido(n));
        System.out.println("são arrays iguais: " + mesmaFrequencia(n,b));
    }
}
