import java.util.HashSet;

public class Dia21 {

    public static boolean contemDuplicado(int[] n) {
        HashSet<Integer> set = new HashSet<Integer>();

        for( int i: n){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void interssecao(int[] n, int[] d){
        HashSet<Integer> set = new HashSet<>();
        for( int i: n){
            set.add(i);
        }

        for (int i : d){
            if(set.contains(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean parComDiferenca(int[] d, int k){
        HashSet<Integer> set = new HashSet<>();

        for (int i =0; i < d.length; i++){
            int menos =  d[i] - k;
            int mais =  d[i] + k;

            if (set.contains(menos) || set.contains(mais)){
                return true;
            }
            set.add(d[i]);
        }

        return false;
    }

    public static void main(String[] args){
        int[] n = {1,2,4,3,5,2,7};
        int[] d = {1,5,3,4,2,6};
        int k = 2;

        System.out.println("tem duplicados: " + contemDuplicado(n));
        interssecao(n, d);
        System.out.println("tem com diferença: " + parComDiferenca(d, k));
    }
}
