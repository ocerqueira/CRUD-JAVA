package appbookelandia.model;

public class ProdutosDoPedido {
    /*atributos*/
    private Produtos produto;
    private int quantidade;
    
    /*construtor*/
    public ProdutosDoPedido() {}

    public ProdutosDoPedido(Produtos produto) {
        
        this.produto = produto;
    }

    public ProdutosDoPedido(Produtos produto, int quantidade) {
       
        this.produto = produto;
        this.quantidade = quantidade;
    }

        /*encapsulamento*/
    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
    
    /*encapsulamento*/
    