package mes1.ArraysIntermediario;

public class array {
    public static void main(String[] args){
        int [] n ={4,7,8,3,2,6,8,};
        int contador = 0;
        int menor = n[0];
        int somar = 0;
        int maior = n[0];
        int segundoMaior = Integer.MIN_VALUE;
        int maiorApareceu = 0;

        for (int i = 0; i<n.length; i++ ){
            if (n[i]%2==0){
                contador++;
            }

            if (n[i] < menor){
                menor = n[i];
            }

            if (n[i] %2==0){
                somar += n[i];
            }

            if (n[i] > maior ){
                maior = n[i];

            }

        }
        for (int i = 0; i<n.length; i++ ){
            if (n[i] == maior){
                maiorApareceu++;
            }

            if (n[i] > segundoMaior && n[i] < maior){
                segundoMaior = n[i];
            }
        }


        System.out.println("existem "  +contador + " numeros pares");
        System.out.println("o menor numero é: " + menor);
        System.out.println("A soma dos numeros pares é: " + somar);
        System.out.println("o maior numero é: " + maior);
        System.out.println("o maior numero apareceu " + maiorApareceu + " vezes");
        System.out.println("-------------------------------------------------------");
        System.out.println("segundo maior é: " + segundoMaior);

    }
}
