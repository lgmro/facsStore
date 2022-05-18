
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
    
    public void alterarProdutoCodigo(int codigoProduto) {
        Produto a = buscarItem(codigoProduto);
        a.alterarProduto();
    }
    
    public void excluirProdutoCodigo(int codigoProduto) {
        Produto a = buscarItem(codigoProduto);
        produtos.remove(a);
    }
}
