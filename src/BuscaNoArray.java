public class BuscaNoArray {
    public static void main(String[] args){
        int[] n = {10,3,4,2,5,6,2};
        boolean b = false;
        int primeiro = -1;
        int apareceu = 0;


        for (int i = 0;i<n.length;i++){

            if (n[i] == 2){
                apareceu++;

            }


            if (!b){
                b= true;
                primeiro = i;
            }

        }
        System.out.println("Primeiro indicie : " + primeiro);
        System.out.println("Numero 2 apareceu : " + apareceu + " vezes.");
        System.out.println("numero 5 foi encontrado:" + b);


    }
}
