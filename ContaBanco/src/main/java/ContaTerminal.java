import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + getNomeCliente() + ", obrigado por criar uma conta" +
                " em nosso banco, sua agência é " + getAgencia() + ", conta " +
                getNumero() + " e o seu saldo R$ " + String.format("%.2f", getSaldo()) + " já está disponível" +
                " para saque.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        System.out.printf("Por favor, digite o número da conta: ");
        conta.setNumero(scanner.nextInt());
        scanner.nextLine();
        System.out.printf("Digite o número da Agência: ");
        conta.setAgencia(scanner.nextLine());
        System.out.printf("Digite o seu nome completo: ");
        conta.setNomeCliente(scanner.nextLine().toUpperCase());
        System.out.printf("Digite o valor do saldo: R$");
        conta.setSaldo(scanner.nextDouble());

        System.out.println(conta.toString());
    }
}
