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
    
    
    
}
