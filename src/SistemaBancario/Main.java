package SistemaBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static double valor;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add( new Conta("Guilherme"));
        contas.add( new Conta("Larissa"));

        int opcao = -1;



        
        while (opcao != 0) {
            System.out.println("-----MENU-----");
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir ");
            System.out.println("4 - Exibir conta");
            System.out.println("5 - Criar conta");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();


            switch (opcao) {
                case 1:

                    System.out.println("Escolha o numero da conta:");
                    int numeroConta = sc.nextInt();

                    Conta contaEscolhida = null;;

                    for (Conta conta: contas){
                        if (conta.getNumeroConta() == numeroConta){
                            contaEscolhida = conta;
                            break;
                        }

                        if (contaEscolhida == null){
                            System.out.println("Conta não encontrada");
                            break;
                        }


                    }
                    System.out.println("Digite o valor do deposito: ");
                    double valor = sc.nextDouble();
                    contaEscolhida.depositar(valor);
                    System.out.println("Depositado com sucesso!");
                    break;

                case 2:

                    System.out.println("Escolha o numero da conta:");
                    int numero = sc.nextInt();

                    Conta aConta = null;

                    for (Conta conta: contas){
                        if (conta.getNumeroConta() == numero){
                            aConta = conta;
                            break;
                        }

                        Conta contaescolhida = Conta.buscarConta(contas, numero);

                        if (contaescolhida == null){
                            System.out.println("Conta não encontrada");
                            break;
                        }
                    }


                    System.out.println("Valor do saque");
                    valor = sc.nextDouble();
                    aConta.sacar(valor);
                    break;
                case 3:
                    System.out.println("numero da conta origem:");
                    int origem  = sc.nextInt();

                    System.out.println("numero da conta destino:");
                    int destino = sc.nextInt();

                    Conta contaOrigem = Conta.buscarConta(contas, origem);
                    Conta contaDestino = Conta.buscarConta(contas, destino);

                    if (contaOrigem == null || contaDestino == null){
                    System.out.println("Conta não encontrada");
                    break;
                    }
                    System.out.println("Valor da transferencia");
                    valor  = sc.nextDouble();

                    contaOrigem.transferir(contaDestino,valor);

                    break;
                    case 4:
                        for (Conta conta : contas){
                            conta.exibirConta();
                        }
                        break;
                case 5:
                    System.out.println("Nome do titular");
                    String nomeTitular = sc.next();

                    Conta nova = new Conta(nomeTitular);
                    contas.add(nova);

                    System.out.println("conta criada com Sucesso!");
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
