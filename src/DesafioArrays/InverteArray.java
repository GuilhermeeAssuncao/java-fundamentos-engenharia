package DesafioArrays;

public class InverteArray {
    public static void main(String[] agrs){
        int[] n = {1,2,3,4,5};

        for (int i = 0; i < n.length / 2; i++) {

            int temp = n[i];
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = temp;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
