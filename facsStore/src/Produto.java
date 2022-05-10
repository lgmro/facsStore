/**
 *
 * @author Bernardo, Victoria, Lucas Gabriel
 */
public class Produto 
{
    private int codigo;
    private String nome;
    private String marca;
    private String cor;
    private String tipo;
    private float valor;

    public Produto(int codigo, String nome, String marca, String cor, String tipo, float valor) 
    {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.tipo = tipo;
        this.valor = valor;
    }

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
}
