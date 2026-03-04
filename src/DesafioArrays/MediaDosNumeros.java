package DesafioArrays;

public class MediaDosNumeros {
    public static void main(String[] agrs){
        int[] n = {10,20,30,20,30,10};
        int soma = 0;


        for (int i = 0;i<n.length;i++){
            soma += n[i];
        }
        System.out.println("a soma dos 6 é: " + soma);
        int media = soma / n.length;
        System.out.println("a media é: " + media);

    }
}
