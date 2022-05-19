
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bernardo, Lucas Gabriel, Victoria
 */
public class Loja 
{
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

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
}
