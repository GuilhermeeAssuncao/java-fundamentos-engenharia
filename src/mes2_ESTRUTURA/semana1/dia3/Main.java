package mes2_ESTRUTURA.semana1.dia3;

public class Main {
    public static void main(String[] args){
    ContaBancaria contaBancaria = new ContaBancaria("gui",13);
    ContaBancaria c2 = new ContaBancaria("gu",14);
    ContaRepository contaRepository = new ContaRepository();

    contaBancaria.depositar(120f);
    contaBancaria.sacar(10f);
    contaBancaria.tranferir(20f,c2);
    contaRepository.salvarConta(contaBancaria);
    }
}
