
import java.util.Scanner;

public class Oculos extends Produto {//Classe para ser um tipo de item
    
    private String tipoLentes, composicaoLentes, composicaoArmacao;

    public Oculos(){};
    
    public Oculos/*Construtor do oculos*/(String tipoLentes, String composicaoLentes, String composicaoArmacao, int codigo, String nome, String marca, String cor, String tipo, float valor) {
        super(codigo, nome, marca, cor, tipo, valor);
        this.tipoLentes = tipoLentes;
        this.composicaoLentes = composicaoLentes;
        this.composicaoArmacao = composicaoArmacao;
    }

    public String getTipoLentes() {
        return tipoLentes;
    }

    public void setTipoLentes(String tipoLentes) {
        this.tipoLentes = tipoLentes;
    }

    public String getComposicaoLentes() {
        return composicaoLentes;
    }

    public void setComposicaoLentes(String composicaoLentes) {
        this.composicaoLentes = composicaoLentes;
    }

    public String getComposicaoArmacao() {
        return composicaoArmacao;
    }

    public void setComposicaoArmacao(String composicaoArmacao) {
        this.composicaoArmacao = composicaoArmacao;
    }//todos os gets e sets
    
    public void imprimir() {//metodo imprime o item tipo oculos
        super.imprimir();
        System.out.println("Tipo de lentes: " + tipoLentes);
        System.out.println("Composição das lentes: " + composicaoLentes);
        System.out.println("Compisição da armação: " + composicaoArmacao);
        System.out.println("------------------------------------ \n");
    }

    public void criarProduto() {//Metodo que cria o produto
        Scanner entrada = new Scanner(System.in);
        super.criarProduto();
        System.out.println("Informe o tipo de lentes: ");
        setTipoLentes(entrada.nextLine());
        System.out.println("Informe a composição das lentes: ");
        setComposicaoLentes(entrada.nextLine());
        System.out.println("Informe a composição da armação: ");
        setComposicaoArmacao(entrada.nextLine());
        System.out.println("------------------------------------ \n");
    }

    public void alterarProduto(int opcao) {//metado para alterar o produto
        Scanner entrada = new Scanner(System.in);
        super.alterarProduto(opcao);
        if(opcao > 6)
        switch (opcao) {
            case 7:
                System.out.println("Novo tipo de lentes: ");
                setTipoLentes(entrada.nextLine());
                break;
            case 8:
                System.out.println("Nova composição das lentes: ");
                setComposicaoLentes(entrada.nextLine());
                break;
            case 9:
                System.out.println("Nova composição da armação: ");
                setComposicaoArmacao(entrada.nextLine());
                break;
            default:
                System.out.println("Não encontrado");
                break;
        }
    }
}
