
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
                    System.out.println("Informe o código do produto: ");
                    int codigoExcluir = entrada.nextInt();
                    loja.excluirProdutoCodigo(codigoExcluir);
                    break;
                default:
                    System.out.println("Número inválido");
                    break; 
                }
        }while(opcao != 5);
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
        System.out.println("4 - Excluir produto");
        System.out.println("5 - Sair");
        opcao = entrada.nextInt();
        return opcao;
    }
}
