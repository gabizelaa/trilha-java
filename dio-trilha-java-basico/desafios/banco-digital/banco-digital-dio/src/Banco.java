import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco {

    private List<Conta> contas;
    private List<Cliente> clientes;

    public Banco() {
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados no banco.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente.getNome());
            }
        }
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}