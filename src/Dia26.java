import java.util.HashMap;

public class Dia26 {
        public static int maiorSubarrayK(int[] n, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int left = 0;
            int max = 0;

            for (int right = 0; right < n.length; right++){
                map.put(n[right],map.getOrDefault(n[right],0) +1);

                while(map.size() > k){
                    map.put(n[left],map.get(n[left])-1);

                    if (map.get(n[left]) == 0){
                        map.remove(n[left]);
                    }

                    left++;
                }
                max = Math.max(max,left - right +1);
            }

            return max;
        }

        public static void main(String[] args){
            int [] n = {1,1,2,2,3};
            int k = 2;


        }
    }


