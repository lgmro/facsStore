
import java.util.Scanner;

public class Principal {//Essa é a classe principal onde vai rodar os metodos
    public static void main(String[] args) {//Metodo main para rodar o sistema
        Loja loja = new Loja();
        criacaoProdutosAutomatico(loja);
        criacaoClientesAutomatico(loja);
        menus(loja);
    }

    private static void menus(Loja loja) {//Esse metodo serve para executar as ações de cada menu.
        Scanner entrada = new Scanner(System.in);
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
                    loja.cadastrarCliente();
                    break;
                case 7:
                    loja.listarClientes();
                    break;
                case 8:
                    loja.vendaProduto();
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Número inválido");
                    break; 
                }
        }while(opcao != 9);
    }

    public static void selecaoTipoProduto(Loja loja) {//Esse metodo cadastra algum tipo de item
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
   
    public static int selecaoMenuPrincipal() {//Esse metodo imprime o menu
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        System.out.println("**** MENU ****");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Pesquisar produto");
        System.out.println("3 - Alterar produto");
        System.out.println("4 - Listar todos os produtos");
        System.out.println("5 - Excluir produto");
        System.out.println("6 - Cadastrar cliente");
        System.out.println("7 - Listar clientes");
        System.out.println("8 - Vender produto");
        System.out.println("9 - Sair");
        opcao = entrada.nextInt();
        return opcao;
    }
    public static void criacaoProdutosAutomatico(Loja loja) {//Esse metodo já deixa alguns itens prontos
            Produto calcaLeg = new Roupas("P", "Longa", 1, "Calça_leg", "Diesel", "Preta", "Calças", 70.0f);
            loja.adicionarProduto(calcaLeg);

            Produto oculosGrau = new Oculos("Monofocal", "Acrílico", "Metal", 2, "Óculos_De_Grau_Gassi", "Gassi", "Preto", "Grau", 500.00f);
            loja.adicionarProduto(oculosGrau);

            Produto tenisNike = new Calcados(40,"Têxtil", 3,"Tênis_Nike_Revolution", "Nike", "Branco", "Tênis", 600.00f);
            loja.adicionarProduto(tenisNike);

            Produto camisaHulk = new Roupas("G", "Curta", 4, "Camisa_Do_Hulk", "Marvel", "Verde_e_Preta", "Camisas", 100.0f);
            loja.adicionarProduto(camisaHulk);

            Produto oculosSol = new Oculos("Polarizada", "PVA", "Plástico", 5, "Óculos_De_Sol_Rayban", "Rayban", "Azul", "Sem_Grau", 300.00f);
            loja.adicionarProduto(oculosSol);

            Produto sandaliaHavaianas = new Calcados(39,"Borracha", 6,"Chinelo_Havaianas_Masculino", "Havaiana", "Preto", "Chinelo", 30.00f);
            loja.adicionarProduto(sandaliaHavaianas);

            Produto bermudaMoletom = new Roupas("M", "Curta", 7, "Bermuda_Moletom_Vermelha", "Polo", "Vermelha", "Bermudas", 120.0f);
            loja.adicionarProduto(bermudaMoletom);
    }

    public static void criacaoClientesAutomatico(Loja loja) {//Esse metodo já deixa alguns clientes prontos
        Cliente Maria = new Cliente("Maria", "Madalena", "234", 600);
        loja.adicionarCliente(Maria);
        Cliente John = new Cliente("John", "Jones", "123", 300);
        loja.adicionarCliente(John);
        Cliente Amelia = new Cliente("Amelia", "Kleber", "12453", 8989);
        loja.adicionarCliente(Amelia);
        Cliente Kleber = new Cliente("Kleber", "Casimiro", "6767", 89);
        loja.adicionarCliente(Kleber);
        Cliente JohnJonas = new Cliente("John", "Jonas", "6217", 900);
        loja.adicionarCliente(JohnJonas);
    }
}
