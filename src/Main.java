//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.println("Digite o preço: ");
        produto.preco = scanner.nextDouble();

        System.out.println("Digite a quantidade inicial do produto: ");
        produto.quantidadeInicial = scanner.nextInt();

        System.out.println("Digite a quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        boolean vendaRealizada = produto.realizarVenda(quantidadeVendida);
        if(vendaRealizada){
            produto.exibirProdutoAtualizado();
        }
        scanner.close();
    }
}