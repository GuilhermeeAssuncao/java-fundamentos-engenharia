package mes1;

public class Dia15 {
    public static void bubbleSort(int[] n){
        for ( int i = 0; i < n.length - 1; i++){

            for (int j = 0; j< n.length - 1; j++){

                if (n[j] > n[j + 1]){

                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1 ] = temp;
                }
            }

        }
    }

    public static void selectionSort(int[] n){
        for ( int i = 0; i < n.length; i++){
            int min = i;

            for (int j = i +1; j< n.length; j++){
                if ( n[j] < n[min]){
                    min = j;
                }
            }
            int temp = n[i];
            n[i] = n[min];
            n[min] = temp;
        }

    }

    public static boolean estaOrdenado(int[] n){
        for ( int i = 0; i < n.length -1; i++){
            if ( n[i] > n[i +1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] n = {7,3,9,1,5};

        bubbleSort(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("  ");
        System.out.println("----------------------------------------------------");

        selectionSort(n);
        for (int i =0; i< n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println("  ");
        System.out.println("----------------------------------------------------");


        System.out.println("esta ordenado: " + estaOrdenado(n));
    }
}
