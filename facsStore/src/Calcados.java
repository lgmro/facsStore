
import java.util.Scanner;

public class Calcados extends Produto {//Classe para ser um tipo de item

    private int numero;
    private String materialInterno;

    public Calcados() {
    }

    ;

    public Calcados/*Construtor do calçados*/(int numero, String materialInterno, int codigo, String nome, String marca, String cor, String tipo, float valor) {
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
    }//todos os gets e sets

    public void imprimir() {//metodo imprime o item tipo calçado
        super.imprimir();
        System.out.println("Número: " + numero);
        System.out.println("Material interno: " + materialInterno);
        System.out.println("------------------------------------ \n");
    }

    public void criarProduto() {//Metodo que cria o produto
        Scanner entrada = new Scanner(System.in);
        super.criarProduto();
        System.out.println("Informe o número: ");
        setNumero(entrada.nextInt());
        System.out.println("Informe o tipo do material interno: ");
        setMaterialInterno(entrada.next());
    }

    public void alterarProduto(int opcao) {//metado para alterar o produto
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
