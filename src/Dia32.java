public class Dia32 {

    public static int removendoDuplicados(int [] n){
        int slow = 0;

        for (int fast = 1; fast < n.length; fast++) {
            if (n[fast] != n[fast - 1]   ) {
                slow++;
                n[slow] = n[fast];

            }
        }

        return slow +1;
    }

    public static void main(String[] args){
        int [] n = { 1,2,2,3,4};

        System.out.println(removendoDuplicados(n));
    }
}
