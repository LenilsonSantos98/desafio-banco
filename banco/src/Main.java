public class Main {
    public static void main(String[] args) {
        Cliente lenilson = new Cliente();
        lenilson.setNome("Lenilson");
        
        Conta cc = new ContaCorrente(lenilson);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(lenilson);

        cc.transferir(70, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
