import java.util.Objects;

public class calculoFacil {
    public static void main(String[] args){

        double a = 4;
        double b = 0;
        String operacao = "g";

        switch (operacao){
            case "+":
                System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);
                break;


            case "*":
                System.out.println(a * b);
                break;


            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida");
                }
                System.out.println(a/b);
                break;

            default:
                throw new IllegalArgumentException("Operação inválida");
        }






        }
    }

