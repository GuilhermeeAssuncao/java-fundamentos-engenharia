package mes1.DesafioArrays;

public class MaiorNumeroDoArray {
    public static void main(String[] args){
        int[] numeros = {2,8, 3, 5, 5, 6, 7, 1,30,3};
        int maior = numeros[0];
        int v = 0;

        for (int i =1; i < numeros.length;i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }

        }

        System.out.println(maior);
    }
}
