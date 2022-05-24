import java.util.ArrayList;

public class Cliente {//Classe do cliente
   
    private String nome, sobrenome, cpf;
    private float quantidadeDinheiro;
    private ArrayList<Produto> carrinhoDeCompras = new ArrayList<>();

    public Cliente(String nome, String sobrenome, String cpf, float quantidadeDinheiro) {//construtor do cliente
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.quantidadeDinheiro = quantidadeDinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getQuantidadeDinheiro() {
        return quantidadeDinheiro;
    }

    public void setQuantidadeDinheiro(float quantidadeDinheiro) {
        this.quantidadeDinheiro = quantidadeDinheiro;
    }

    public ArrayList<Produto> getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(ArrayList<Produto> carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public void setProdutoNoCarrinho(Produto produto) {
        this.carrinhoDeCompras.add(produto);
    }//todos os gets e stes

    public void imprimir() {//metodo que imprime todos os dados do cliente
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Valor na carteira: " + this.quantidadeDinheiro);
        System.out.println("**** PRODUTOS COMPRADOS ****");
        if (carrinhoDeCompras.size() != 0) {
            for (Produto produtosComprados : carrinhoDeCompras) {
                System.out.println("Produto comprado: " + produtosComprados.getNome());
                System.out.println("Valor do produto: " + produtosComprados.getValor());
                System.out.println(" ******* ");
            }
        } else {
            System.out.println("Cliente ainda não efetuou compras na loja");
        }
        System.out.println("--------------------------------------------------");
    }
}
