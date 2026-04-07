import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Dia31 {

    public static int[] inversor(int [] n){
        int left =0;
        int right = n.length-1;

        while (left < right){
            int temp = n[left];
            n[left] = n[right];
            n[right] = temp;

            left++;
            right--;
        }

        return n;
    }

    public static int[] movendoZeros(int [] z){
        int slow = 0;

       for( int fast =0; fast < z.length; fast++ ){
           if(z[fast] != 0){
               z[slow] = z[fast];
               slow++;
           }
       }

       while ( slow < z.length){
           z[slow] = 0;
           slow++;
       }

        return z;
    }

    public static int[] movendoZeros2(int [] z){
        int slow = 0;

        for( int fast= 0; fast < z.length; fast++){
            if(z[fast] != 0 ){
                z[slow] = z[fast];
                slow++;
            }
        }

        while(slow < z.length){
            z[slow] = 0;
            slow++;
        }
        return z;
    }


    public static void main(String[] args) {
        int[] n = { 1,2,3,4,4,4,3};
        int [ ]  z = {0,1,3,0,15,4};

        System.out.println(Arrays.toString(inversor(n)));
        System.out.println(Arrays.toString(movendoZeros(z)));
        System.out.println(Arrays.toString(movendoZeros2(z)));
    }
}
