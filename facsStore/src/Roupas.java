
import java.util.Scanner;

public class Roupas extends Produto {//Classe para ser um tipo de item
    
    private String tamanho,tipoManga;
    public Roupas(){};

    public Roupas/*Construtor de roupas*/(String tamanho, String tipoManga, int codigo, String nome, String marca, String cor, String tipo, float valor) {
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
    }//todos os gets e sets

    public void imprimir() {//metodo imprime o item tipo roupa
        super.imprimir();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Tipo de Manga: " + tipoManga);
        System.out.println("------------------------------------ \n");
    }
    
    public void criarProduto() {//Metodo que cria o produto
        Scanner entrada = new Scanner(System.in);
        super.criarProduto();
        System.out.println("Informe o tamanho: ");
        setTamanho(entrada.nextLine());
        System.out.println("Informe o tipo de Manga: ");
        setTipoManga(entrada.nextLine());
    }

    public void alterarProduto(int opcao) {//metado para alterar o produto
        Scanner entrada = new Scanner(System.in);
        super.alterarProduto(opcao);
        if(opcao > 6)
        switch (opcao) {
            case 7:
                System.out.println("Novo Tamanho: ");
                setTamanho(entrada.nextLine());
                break;
            case 8:
                System.out.println("Novo Tipo de Manga: ");
                setTipoManga(entrada.nextLine());
                break;
            default:
                System.out.println("Não encontrado");
                break;
        }
    }
}
