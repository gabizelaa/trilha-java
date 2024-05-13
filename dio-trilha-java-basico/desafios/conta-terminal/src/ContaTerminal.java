import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário

        System.out.println("Por favor, digite o número da Agência!");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite a Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = sc.nextDouble();
        sc.nextLine();

        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem final

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque!");
    }
}