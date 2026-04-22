package mes1.Dia17;

import java.util.HashMap;
import java.util.HashSet;

public class Dia18rameke {
    public static boolean temDuplicado(int[] n){
        HashSet<Integer> set = new HashSet<>();

        for (int i : n){
            if (set.contains(i)){
                return true;
            }
            set .add(i);
        }
        return false;
    }

    public static int primeiroDuplicado(int[] n){
        HashSet<Integer> set = new HashSet<>();

        for (int i : n){
            if (set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return -1;
    }

    public static void frequencia(int[] n){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : n){
            int frequenciaAtual = map.getOrDefault(i,0);

            map.put(i, frequenciaAtual + 1);
        }
         for (int i : map.keySet()){
             System.out.print(i + " -> " + map.get(i) + ", ");
         }

    }

    public static int[] twoSum(int[] n2, int alvo){
        // Criamos um mapa (número → índice)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Percorremos o array
            for ( int i = 0 ; i < n2.length; i++){

                // Descobrimos o número que falta para chegar no alvo
                int temp = alvo - n2[i];

                // Perguntamos: já vimos esse número antes?
                if (map.containsKey(temp)){

                    // Se sim, encontramos a resposta!
                    // Retornamos:
                    // índice do complemento + índice atual
                    return new int[] {map.get(temp),i};
                }

                // Se não encontramos, guardamos o número atual no mapa
                // (valor → índice)
                map.put(n2[i], i);
            }

        // Se não encontrou nenhum par
            return new int[] { -1, -1};
    }

    public static void main(String[ ] args){
        int[] n = {2,5,1,2,3,5};
        int[] n2 = {2,7,11,15};
        int alvo = 9;

        System.out.println("tem suplicados: " + temDuplicado(n));
        System.out.println("primeiro duplicados: " + primeiroDuplicado(n));
        frequencia(n);

        int[] resultado = twoSum(n2, alvo);
        System.out.println("two Sum:" + resultado[0] + ", " + resultado[1]);
    }

}
