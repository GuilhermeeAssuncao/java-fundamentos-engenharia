package desafioDia6;

public class exercicio1 {

        public static int maiorNumero(int[] n){
            int maior = n[0];

            for (int i = 1; i < n.length; i++){
                if(n[i] > maior){
                    maior = n[i];
                }
            }

            return maior;
        }
        public static int numerosPares(int[] n){
            int contador = 0;

            for (int i = 0; i < n.length; i++){
                if(n[i]%2==0){
                    contador++;
                }
            }
            return contador;
        }

    public static boolean estaOrdenado(int[] n){
        boolean ordenado = true;

        for (int i = 0; i < n.length - 1; i++){
            if (n[i] > n[i+1]){
                return false;
            }
        }
        return ordenado;
    }

    public static double calcularMedia(int[] n){
            int soma = 0;


            for (int i = 0; i < n.length; i++){
                soma += n[i];

            }
        double media = (double) soma / n.length;


            return media;
    }


        public static void main(String[] args) {

            int[] numeros = {3,7,2,9,5};

            int resultado = maiorNumero(numeros);
            int contador = numerosPares(numeros);
            boolean resultadoOrdenado = estaOrdenado(numeros);

            System.out.println("O maior numero é: " + resultado);
            System.out.println("existem " + contador + " numeros pares");

            if (resultadoOrdenado){
                System.out.println("ordenado");
            }else {
                System.out.println("não ordenado");
            }
            System.out.println("------------------------------------------------------");
            System.out.println("a media é: " + calcularMedia(numeros));
        }
    }
