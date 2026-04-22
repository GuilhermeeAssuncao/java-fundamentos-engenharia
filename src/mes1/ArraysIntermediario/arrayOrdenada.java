package mes1.ArraysIntermediario;
public class arrayOrdenada {
    public static void main(String[] args){

        int[] n = {1,3,2,4,5};
        boolean ordenado = true;

        for (int i = 0; i < n.length - 1; i++){

            if (n[i] > n[i+1]){
                ordenado = false;
            }

        }

        if (ordenado){
            System.out.println("Array está ordenado");
        } else {
            System.out.println("Array NÃO está ordenado");
        }

    }
}