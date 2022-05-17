
import java.util.Scanner;

public class Oculos extends Produto {
    
    private String tipoLentes, composicaoLentes, composicaoArmacao;

    public Oculos(String tipoLentes, String composicaoLentes, String composicaoArmacao, int codigo, String nome, String marca, String cor, String tipo, float valor) {
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
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de lentes: " + tipoLentes);
        System.out.println("Composição das lentes: " + composicaoLentes);
        System.out.println("Compisição da armação: " + composicaoArmacao);
    }
    public void alterarProduto() {
        Scanner entrada = new Scanner(System.in);
        super.alterarProduto();
        System.out.println("Novo tipo de lentes: ");
        setTipoLentes(entrada.nextLine());
        System.out.println("Nova composição das lentes: ");
        setComposicaoLentes(entrada.nextLine());
        System.out.println("Nova composição da armação: ");
        setComposicaoArmacao(entrada.nextLine());
    }
    
}
