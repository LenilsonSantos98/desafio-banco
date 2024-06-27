import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco desafio");
        
        Cliente lenilson = new Cliente();
        lenilson.setNome("Lenilson");
        Conta cc = new ContaCorrente(lenilson);
        cc.depositar(100);
        banco.adicionarConta(cc);

        Conta poupanca = new ContaPoupanca(lenilson);
        banco.adicionarConta(poupanca);
        cc.transferir(70, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo");
        
        Conta ccRodrigo = new ContaCorrente(rodrigo);
        banco.adicionarConta(ccRodrigo);
        ccRodrigo.imprimirExtrato();
        
        System.out.println("=== Contas Cadastradas ===");
        banco.imprimirContas();
    }
}
