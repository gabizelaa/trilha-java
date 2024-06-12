import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente g = new Cliente("Cliente 1");
        List<Conta> contas = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        g.setNome("Gabriela");

        Conta cc = new ContaCorrente(g);
        Conta poupanca = new ContaPoupanca(g);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco();

        banco.adicionarCliente(new Cliente("Gabi"));
        banco.adicionarCliente(new Cliente("Lucas"));

        banco.listarClientes();




    }
}
