
import java.util.ArrayList;

/**
 *
 * @author Bernardo, Lucas Gabriel, Victoria
 */
public class Loja 
{
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
     
    public void cadastrarProduto(Produto produto) {
        produto.alterarProduto();
        produtos.add(produto);
    }
    
    public Produto buscarItem(int codigoProduto) {
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
        a.imprimir();
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
