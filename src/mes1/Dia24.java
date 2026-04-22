package mes1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Dia24 {
    public static boolean numerosUnicos(int[] n ){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : n){
            if (set.contains(i)){
                return false;
            }
            set.add(i);
        }


        return true;
    }

    public static int numeroMaisFrequente(int[] n){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<> ();
        for (int i : n){
                map.put(i,map.getOrDefault(i,0)+1);
        }
        int maiorfrequencia  = 0;
        int numerosMaisFrequente = 0;

        for (int i : map.keySet()){
            int freq = map.get(i);

            if (map.get(i) > maiorfrequencia || freq == maiorfrequencia && i < numerosMaisFrequente){
                maiorfrequencia = freq;
                numerosMaisFrequente = i;
            }
        }
        return numerosMaisFrequente;
    }

    public static int primeiroRepedido(int[ ] n){
        HashSet<Integer> set = new HashSet<> ();

        for ( int i : n){
            if  (set.contains(i)){
                return i;
            }
            set.add(i);
        }

        return -1;
    }

    public static int unicoNumeroUnico(int [] b){
        HashMap<Integer, Integer> map = new HashMap<> ();

        for(int i : b){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for (int i :b){
            if( map.get(i) == 1 ) {
               return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {1,2,6,2,6,4,5,6};
        int[] b = {1,1,2,2,3,3,4};

        System.out.println("os numeros da array são unicos? " + numerosUnicos(n));
        System.out.println("o numero mais frequente é: " + numeroMaisFrequente(n));
        System.out.println("O primeiro numero repetido é: " + primeiroRepedido(n));
        System.out.println("o numero unico é: " +  unicoNumeroUnico(b));
    }
}
