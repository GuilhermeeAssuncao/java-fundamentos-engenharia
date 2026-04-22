package mes1;

public class Dia11 {
    public static int somaArray(int[] n){
        int soma = 0;

        for (int i = 0; i < n.length; i++){
            soma += n[i];
        }
        return soma;
    }

    public static int contarImpares(int[] n){
        int contarImpar = 0;

        for (int i =0;i < n.length; i++){
            if (n[i] % 2 == 1){
                contarImpar++;
            }
        }
        return contarImpar;
    }

    public static int menorNumero(int[] n){
        int menorN = n[0];

        for (int i =1; i < n.length; i++){
            if ( n[i] < menorN) {
                menorN = n[i];
            }
        }
        return menorN;
    }

    public static void main(String[] args){
        int[] n ={7,3,9,2,8};

        System.out.println("A soma da array é: " + somaArray(n));
        System.out.println("numeros impares apareceram " + contarImpares(n) + " vezes.");
        System.out.println("O menor numero da Array é: " + menorNumero(n));
    }
}
