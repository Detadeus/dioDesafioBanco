public class main {

    public static void main (String[] args) {
        conta cc = new contaCorrente();
        cc.depositar(100);


        conta poupanca = new contaPoupanca();
        //poupanca.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
