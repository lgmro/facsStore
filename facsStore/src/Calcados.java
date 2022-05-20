
import java.util.Scanner;

public class Calcados extends Produto {

    private int numero;
    private String materialInterno;

    public Calcados() {
    }

    ;

    public Calcados(int numero, String materialInterno, int codigo, String nome, String marca, String cor, String tipo, float valor) {
        super(codigo, nome, marca, cor, tipo, valor);
        this.numero = numero;
        this.materialInterno = materialInterno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMaterialInterno() {
        return materialInterno;
    }

    public void setMaterialInterno(String materialInterno) {
        this.materialInterno = materialInterno;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Número: " + numero);
        System.out.println("Material interno: " + materialInterno);
        System.out.println("------------------------------------ \n");
    }

    public void criarProduto() {
        Scanner entrada = new Scanner(System.in);
        super.criarProduto();
        System.out.println("Informe o número: ");
        setNumero(entrada.nextInt());
        System.out.println("Informe o tipo do material interno: ");
        setMaterialInterno(entrada.next());
    }

    public void alterarProduto(int opcao) {
        Scanner entrada = new Scanner(System.in);
        super.alterarProduto(opcao);
        if(opcao > 6)
        switch (opcao) {
            case 7:
                System.out.println("Novo número: ");
                setNumero(entrada.nextInt());
                break;
            case 8:
                System.out.println("Novo material interno: ");
                setMaterialInterno(entrada.nextLine());
                break;
            default:
                System.out.println("Não encontrado");
                break;
        }
    }
}
