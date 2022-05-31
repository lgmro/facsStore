
import java.util.Scanner;

public class Produto//clase base de produto
{
    private int codigo;
    private String nome;
    private String marca;
    private String cor;
    private String tipo;
    private float valor;
    private int tipoOperacao;

    public String getTipoOperacao() {
        String operacao = "";
        if (tipoOperacao == 1) {
            operacao = "Débito";
        } else if (tipoOperacao == 2) {
            operacao = "Crédito";
        } else {
            operacao = "Pix";
        }
        
        return operacao;
    }

    public void setTipoOperacao(int tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
    
    public Produto(){};
    public Produto/*Construtor do produto*/(int codigo, String nome, String marca, String cor, String tipo, float valor)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
    }//metodo para imprimir um produtor

    public void criarProduto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe código: ");
        setCodigo(entrada.nextInt());
        System.out.println("Informe nome: ");
        setNome(entrada.next());
        System.out.println("Informe marca: ");
        setMarca(entrada.next());
        System.out.println("Informe cor: ");
        setCor(entrada.next());
        System.out.println("Informe tipo: ");
        setTipo(entrada.next());
        System.out.println("Informe valor: ");
        setValor(entrada.nextFloat());
    }//metodo para criar o produto

    public void alterarProduto(int opcao) {
        Scanner entrada = new Scanner(System.in);
        switch (opcao) {
            case 1:
                System.out.println("Novo código: ");
                setCodigo(entrada.nextInt());
                break;
            case 2:
                System.out.println("Novo nome: ");
                setNome(entrada.next());
                break;
            case 3:
                System.out.println("Nova marca: ");
                setMarca(entrada.next());
                break;
            case 4:
                System.out.println("Nova cor: ");
                setCor(entrada.next());
                break;
            case 5:
                System.out.println("Novo tipo: ");
                setTipo(entrada.next());
                break;
            case 6:
                System.out.println("Novo valor: ");
                setValor(entrada.nextFloat());
                break;
        }
    }//metodo para um dado especifico do produto

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getCor() 
    {
        return cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public float getValor() 
    {
        return valor;
    }

    public void setValor(float valor) 
    {
        this.valor = valor;
    }  
}//todos os gets e sets
