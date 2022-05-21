
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja
{
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produto.criarProduto();
        produtos.add(produto);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    private Produto buscarItem(int codigoProduto) {
        Produto a = null;
        for (Produto item : produtos) {
            if (codigoProduto == item.getCodigo()) {
               a = item;
            }
        }
        return a;
    }
    public void pesquisarProdutoCodigo(int codigoProduto) {
        Produto a = buscarItem(codigoProduto);
        if (a == null) {
            System.out.println("Produto não encontrado");
        } else {
            a.imprimir();
        }
    }

    public void listarProdutos() {
        for (Produto item : produtos) {
            item.imprimir();
        }
    }

    public void alterarProdutoCodigo(int codigoProduto) {
        Scanner entrada = new Scanner(System.in);
        Produto a = buscarItem(codigoProduto);

        System.out.println("**** ALTERAÇÕES POSSÍVEIS ****");
        System.out.println("Óculos: 1 - Código  2 - Nome  3 - Marca  4 - Cor  5 - Tipo 6 - Valor  7 - Tipo lente 8 - Composição lente 9 - Composição armação");
        System.out.println(" -------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Calçado: 1 - Código  2 - Nome  3 - Marca  4 - Cor  5 - Tipo 6 - Valor  7 - Número 8 - Material interno");
        System.out.println(" -------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Roupas: 1 - Código  2 - Nome  3 - Marca  4 - Cor  5 - Tipo 6 - Valor  7 - Tamanho 8 - Tipo de manga");
        System.out.println(" -------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Informe o número do atributo que você quer alterar: ");
        int opcao = entrada.nextInt();
        a.alterarProduto(opcao);
    }

    public void excluirProdutoCodigo(int codigoProduto) {
        Produto a = buscarItem(codigoProduto);
        if (a == null) {
            System.out.println("Produto não encontrado");
        } else {
            produtos.remove(a);
        }
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarCliente() {
        Scanner entrada = new Scanner(System.in);
        String nome, sobrenome, cpf;
        float carteira;
        System.out.println("**** CADASTRO CLIENTE ****");
        System.out.println("Informe o nome do cliente: ");
        nome = entrada.next();
        System.out.println("Informe o sobrenome do cliente: ");
        sobrenome = entrada.next();
        System.out.println("Informe o cpf do cliente: ");
        cpf = entrada.next();
        System.out.println("Informe o valor da carteira do cliente: ");
        carteira = entrada.nextFloat();

        Cliente cliente =  new Cliente(nome, sobrenome, cpf, carteira);
        clientes.add(cliente);
    }

     public Cliente buscarCliente(String cpfCliente) {
        Cliente a = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpfCliente)) {
                a = cliente;
            }
        }
         return a;
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            cliente.imprimir();
        }
    }

    public void vendaProduto() {
        Scanner entrada = new Scanner(System.in);
        int codigoProduto;
        System.out.println("Informe o código do produto a ser vendido");
        codigoProduto = entrada.nextInt();
        Produto y = buscarItem(codigoProduto);
        if (y == null) {
            System.out.println("Produto não encontrado");
        } else {
            System.out.println("Informe o cpf do cliente");
            String cpf = entrada.next();
            Cliente x = buscarCliente(cpf);
            if (x != null) {
                float valorAtualizado = x.getQuantidadeDinheiro() - y.getValor();
                if(valorAtualizado <= x.getQuantidadeDinheiro() && valorAtualizado >= 0) {
                    x.setProdutoNoCarrinho(y);
                    x.setQuantidadeDinheiro(valorAtualizado);
                    produtos.remove(y);
                } else {
                    System.out.println("Saldo insuficiente na carteira do cliente.");
                }
            } else {
                System.out.println("Cliente não encontrado");
            }
        }
    }
}