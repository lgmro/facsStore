
import java.util.Scanner;

public class Calcados extends Produto {
    
    private int numero;
    private String materialInterno;
    
    public Calcados(){};

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
    }
    public void alterarProduto() {
        Scanner entrada = new Scanner(System.in);
        super.alterarProduto();
        System.out.println("Novo número: ");
        setNumero(entrada.nextInt());
        System.out.println("Novo material interno: ");
        setMaterialInterno(entrada.nextLine());
    }
    
}
