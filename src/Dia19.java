import java.util.HashMap;
import java.util.HashSet;

public class Dia19 {

    public static boolean existePar(int[] n2, int alvo){
        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i < n2.length; i++){

            int complemento = alvo - n2[i];

            if(set.contains(complemento)){
                return true;
            }
            set.add(n2[i]);


        }
        return false;
    }

    public static int[] twoSum(int[] n2, int alvo){
        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int i = 0; i  < n2.length; i++){

            // Descobrimos o número que falta para chegar no alvo
            int complemento = alvo - n2[i];

            // Perguntamos: já vimos esse número antes?
            if (map.containsKey(complemento)){

                // Se sim, encontramos a resposta!
                // Retornamos:
                // índice do complemento + índice atual
                return new int [] {map.get(complemento), i};
            }
// Se não encontramos, guardamos o número atual no mapa
            // (valor → índice)
            map.put(n2[i], i);
        }

        // Se não encontrou nenhum par
        return new int [] {-1,-1};
    }

    public static int primeiroDuplicado(int[] n){
        HashSet<Integer> set = new HashSet<>();

        for ( int i : n){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }

        return -1;
    }



    public static void main(String[ ] args){
        int[] n = {2,5,1,2,3,5};
        int[] n2 = {2,7,11,15};
        int alvo = 9;

        System.out.println("tem par: " + existePar(n2, alvo));
        int[] resultado = twoSum(n2, alvo);
        System.out.println("two Sum:" + resultado[0] + ", " + resultado[1]);
        System.out.println("primeiro duplicados: " + primeiroDuplicado(n));

    }

}
