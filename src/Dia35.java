public class Dia35 {

    public static int menorSubArray(int [] n, int alvo){
       int left = 0;
       int soma =0;
       int min = Integer.MAX_VALUE;

       for (int right = 0; right < n.length; right++){
           soma += n[right];

           while (soma >= alvo){
               min = Math.min(min, right - left +1);
               soma -= n[left];
               left++;
           }
       }

        return min == Integer.MAX_VALUE ? 0 : min;

    }

    public static int maiorSubArrayMenorQueAlvo(int[] n, int alvo){
        int left = 0;
        int soma = 0;
        int max = 0;

      for (int right= 0; right < n.length  ;right++){
          soma += n[right];

          while (soma > alvo){
              soma -= n[left];
              left++;
          }

          max = Math.max(max, right - left +1);
      }

      return max;
    }

    public static void main(String[] args) {
        int [] n = {2,3,1,2,4,3};
        int alvo = 7;


        System.out.println(menorSubArray(n, alvo));
        System.out.println(maiorSubArrayMenorQueAlvo(n, alvo));
    }
}
