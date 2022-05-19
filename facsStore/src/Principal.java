
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1272115763
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Loja loja = new Loja();
        criacaoProdutosAutomatico(loja);
         int opcao;
        do {
            opcao = selecaoMenuPrincipal();
            switch(opcao) {
                case 1:
                    selecaoTipoProduto(loja);
                    break;
                case 2:
                    System.out.println("Informe o código do produto: ");
                    int codigo = entrada.nextInt();
                    loja.pesquisarProdutoCodigo(codigo);
                    break;
                case 3:
                    System.out.println("Informe o código do produto: ");
                    int codigoProduto = entrada.nextInt();
                    loja.alterarProdutoCodigo(codigoProduto);
                    break;
                case 4:
                    loja.listarProdutos();
                    break;
                case 5:
                    System.out.println("Informe o código do produto: ");
                    int codigoExcluir = entrada.nextInt();
                    loja.excluirProdutoCodigo(codigoExcluir);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Número inválido");
                    break; 
                }
        }while(opcao != 6);
    }
    
    public static void selecaoTipoProduto(Loja loja) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        System.out.println("**** TIPOS PRODUTOS ****");
        System.out.println("1 - Oculos");
        System.out.println("2 - Calçados");
        System.out.println("3 - Roupas");
        opcao = entrada.nextInt();
        switch(opcao) {
                case 1:
                    Produto oculos = new Oculos();
                    loja.cadastrarProduto(oculos);
                    break;
                case 2:
                    Produto calcados = new Calcados();
                    loja.cadastrarProduto(calcados);
                    break;
                case 3:
                    Produto roupas = new Roupas();
                    loja.cadastrarProduto(roupas);
                    break;
                default:
                    System.out.println("Número inválido");
                    break; 
        }
    }
   
    public static int selecaoMenuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        System.out.println("**** MENU ****");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Pesquisar produto");
        System.out.println("3 - Alterar produto");
        System.out.println("4 - Listar todos os produtos");
        System.out.println("5 - Excluir produto");
        System.out.println("6 - Sair");
        opcao = entrada.nextInt();
        return opcao;
    }
    public static void criacaoProdutosAutomatico(Loja loja) {
            Produto oculosSol = new Roupas("P", "Curta", 1, "Calça leg", "Sem marca", "Preta", "Calças", 70.0f);
            loja.adicionarProduto(oculosSol);
    }
}
