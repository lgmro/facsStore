
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loja//Classe da loja
{
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produto.criarProduto();
        produtos.add(produto);
    }//metodo para cadastrar o produto

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }//metodo para adicionar um produto

    private Produto buscarItem(int codigoProduto) {
        Produto a = null;
        for (Produto item : produtos) {
            if (codigoProduto == item.getCodigo()) {
               a = item;
            }
        }
        return a;
    }//metodo para encontrar um item
    public void pesquisarProdutoCodigo(int codigoProduto) {
        Produto a = buscarItem(codigoProduto);
        if (a == null) {
            System.out.println("Produto não encontrado");
        } else {
            a.imprimir();
        }
    }//metodo para encontrar o produto pelo codigo

    public void listarProdutos() {
        for (Produto item : produtos) {
            item.imprimir();
        }
    }//metodo para listar todos os produtos 

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
    }//metodo para alterar o produto pelo codigo

    public void excluirProdutoCodigo(int codigoProduto) {
        Produto a = buscarItem(codigoProduto);
        if (a == null) {
            System.out.println("Produto não encontrado");
        } else {
            produtos.remove(a);
        }
    }//metodo para excluir produto pelo codigo

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }//metodo para adicionar um cliente

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
    }//metodo para cadastrar o cliente

     public Cliente buscarCliente(String cpfCliente) {
        Cliente a = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpfCliente)) {
                a = cliente;
            }
        }
         return a;
    }//metodo para encontrar o cliente pelo cpf

    public void listarClientes() { 
        Collections.sort(clientes);
        for (Cliente cliente : clientes) {
            cliente.imprimir();
        }
    }//metodo para listar todos os clientes

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
    }//metodo para vender os produtos para o cliente
}
