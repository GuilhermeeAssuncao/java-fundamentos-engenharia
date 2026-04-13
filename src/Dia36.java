import java.util.HashMap;
import java.util.HashSet;

public class Dia36 {

    public static int maiorSemRepetir(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int left =0;
        int max = 0;

        // percorrer
        for(int right =0; right< s.length(); right++){
            //variavel char
            char c = s.charAt(right);


            //verifica se ja foi visto
            if (map.containsKey(c)){
                left = Math .max(left,map.get(c) + 1);
            }

            //adiciona o char e o Integer
            map.put(c, right);

            //atualiza o max
            max = Math.max(max, right -left +1);

        }
        return max;
    }

    public static void main(String[] args){
        String s = "abcbb";

    }
}
