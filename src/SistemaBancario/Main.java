package SistemaBancario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta("Guilherme");
        Conta c1 = new Conta("Larissa");
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        System.out.println("Escolha a conta: 1-Guilherme | 2-Larissa");
        int escolhaConta = sc.nextInt();

        Conta conta = null;

        if (escolhaConta == 1){
            conta = c;
        }else if (escolhaConta == 2){
            conta = c1;
        }
        
        while (opcao != 0) {
            System.out.println("-----MENU-----");
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir ");
            System.out.println("4 - Exibir conta");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                    System.out.println("Depositado com sucesso!");
                    break;
                case 2:
                    System.out.println("Valor do saque");
                    valor = sc.nextDouble();
                    conta.sacar(valor);
                    System.out.println(valor + " sacado com sucesso!");
                    break;
                case 3:
                    System.out.println("Valor da transferencia");
                    valor = sc.nextDouble();
                    conta.transferir(c1, valor);
                    System.out.println("Valor da transferencia realizado");
                    break;
                    case 4:
                        conta.exibirConta();
                        break;
                case 0:
                    System.out.println("Saindo da conta");
                    break;
                    default:
                        System.out.println("Opção errada");
            }
        }

    }
}
