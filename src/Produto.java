public class Produto {
    String nome;
    double preco;
    int quantidadeInicial;
    int quantidadeVendida;
    int quantidadeAtual;

    public void exibirProdutoAtualizado() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque antes da venda: " + quantidadeInicial + " unidades");
        System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
        System.out.println("Estoque atualizado: " + (quantidadeAtual) + " unidades");
    };
    public boolean realizarVenda(int quantidade){
        if(quantidade <= quantidadeInicial){
            quantidadeVendida = quantidade;
            quantidadeAtual = quantidadeInicial - quantidade;
            System.out.println("Venda realizada com sucesso");
            return true;
        } else{
            System.out.println("Estoque insuficiente");
            return false;
        }
    }
}
