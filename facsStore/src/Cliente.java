public class Cliente {
   
    private String nome, sobrenome, cpf;
    private float quantidadeDinheiro;
    private Produto carrinhoDeCompras;

    public Cliente(String nome, String sobrenome, String cpf, float quantidadeDinheiro, Produto carrinhoDeCompras) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.quantidadeDinheiro = quantidadeDinheiro;
        this.carrinhoDeCompras = carrinhoDeCompras;
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

    public Produto getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(Produto carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    
    
}
