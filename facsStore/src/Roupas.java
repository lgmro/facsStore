
import java.util.Scanner;

public class Roupas extends Produto {
    
    private String tamanho,tipoManga;

    public Roupas(String tamanho, String tipoManga, int codigo, String nome, String marca, String cor, String tipo, float valor) {
        super(codigo, nome, marca, cor, tipo, valor);
        this.tamanho = tamanho;
        this.tipoManga = tipoManga;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoManga() {
        return tipoManga;
    }

    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }
    
    public void alterarProduto() {
        Scanner entrada = new Scanner(System.in);
        super.alterarProduto();
        System.out.println("Novo Tamanho: ");
        setTamanho(entrada.nextLine());
        System.out.println("Novo Tipo de Manga: ");
        setTipoManga(entrada.nextLine());
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Tipo de Manga: " + tipoManga);
    }
    
}
