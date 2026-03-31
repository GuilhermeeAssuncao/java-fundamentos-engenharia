import java.util.HashSet;

public class Dia25 {

    public static int maiorSubarray(int[] n) {
        int max = 0;

        for (int i = 0; i < n.length; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < n.length; j++) {
                if (set.contains(n[j])) {
                    break;
                }
                set.add(n[j]);
            }

            max = Math.max(max, set.size());
        }

        return max;
    }

    public static int  maiorSubarray2(int[] n) {
            HashSet<Integer> set = new HashSet<>();
            int left = 0;
            int max = 0;

            for (int right = 0; right < n.length; right++) {

                while (set.contains(n[right])) {
                    set.remove(n[left]);
                    left++;
                }

                set.add(n[right]);
                max = Math.max(max, right - left + 1);
            }

            return max;

    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,1,2,3,5};


        System.out.println();
    }

}
