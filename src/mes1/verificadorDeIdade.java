package mes1;

public class verificadorDeIdade {
    public static void main(String[] args){

        int i = 12;

        if (i < 18){
            System.out.println("menor de idade");
        }else if (i <= 59){
            System.out.println("adulto");
        }else if (i > 60){
            System.out.println("Idoso");
        }else {
            System.out.println("erro");
        }
    }
}
