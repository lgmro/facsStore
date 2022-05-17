/**
 *
 * @author Bernardo, Lucas Gabriel, Victoria
 */
public class Loja {
    private int qtdProduto;
    Produto[] produtos;
    
    public Loja(int qtdProduto) {
        produtos = new Produto[qtdProduto];
    }
    
    public void addProduto(Produto produto) {
        for(int i = 0; i < produtos.length; i++) {
            if(produtos[i] == null) {
                produtos[i] = produto;
            }
        }
    }
    
    
    
    
}
