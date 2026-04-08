import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class simuladoDia32 {

    public static int[] Towsun(int[] n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int target = 0;
        int alvo = 9;

        for (int i = 0; i < n.length; i++){
            target = alvo - n[i];
            if (map.containsKey(target)){
                return new  int[]{i,map.get(target)};
            }
            map.put(n[i],i);

        }

        return null;
    }

    public static int[] movendoZeros(int[] m){
        int slow= 0;

        for (int fast =0;fast<m.length;fast++){
            if (m[fast]!=0){
                m[slow]=m[fast];
                slow++;
            }
        }
        while (slow<m.length){
            m[slow]=0;
            slow++;
        }

        return m;
    }

    public static int somaSub(int[] s){
        int soma=0;
        int maior = s[0];

        for (int i=0;i<s.length;i++){
            soma+=s[i];

            if(soma> maior){
                maior = soma;
            }

            if (soma < 0 ){
                soma = 0;
            }
        }


        return maior;
    }

    public static boolean contemDuplicado(int[] d){
        HashSet<Integer> set = new HashSet<>();

        for(int i : d){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] d = {2,2,4,3,5};
        int [] m = {0,1,2,0,14};
        int [] s= {-2,1,-3,4,-1,2,1,-5,4};
        int[] n= {2,7,11,15};


        System.out.println("tem Duplicados: " + contemDuplicado(d));
        System.out.println(Arrays.toString(movendoZeros(m)));
        System.out.println(somaSub(s));
        System.out.println(Arrays.toString(Towsun(n)));
    }
}
