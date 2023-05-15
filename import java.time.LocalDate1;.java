import java.time.LocalDate;
import java.util.Scanner;

public class CadastroCliente {
    private static ClienteDAO clienteDAO = new ClienteDAO();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("----- Menu -----");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void cadastrarCliente() {
        System.out.println("----- Cadastro de Cliente -----");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Data de Nascimento (yyyy-MM-dd): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        Cliente cliente = new Cliente();
        cliente.set
        }
}