package map.Pesquisa;

import set.Ordenacao.Produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()){
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }

}
