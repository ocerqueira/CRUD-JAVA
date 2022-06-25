package appbookelandia.model;

public class Produtos {
    /*atributos*/
    private int codigoDoProduto;
    private int codigoDaCategoria;
    private String nome;
    private String descricao;
    private double preco;

    
    /*construtor*/
      public Produtos() {
    }
    
    public Produtos(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    /*para cadastrar um novo produto*/
    public Produtos(int codigoDoProduto, String nome) {
        this.codigoDoProduto = codigoDoProduto;
        this.nome = nome;
    }
    
    public Produtos(int codigoDoProduto, String nome, double preco){
        this.codigoDoProduto = codigoDoProduto;
        this.nome = nome;
        this.preco = preco;
    }

  

   
    
    /*encapsulamento*/
    public int getCodigoDoProduto (){
        return this.codigoDoProduto;
    }
    
    public void setCodigoDoProduto (int codigoDoProduto){
        this.codigoDoProduto = codigoDoProduto;
    }
    
    public int getCodigoDaCategoria (){
        return this.codigoDaCategoria;
    }
    
    public void setCodigoDaCategoria (int codigoDaCategoria){
        this.codigoDaCategoria = codigoDaCategoria;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
     public String getDescricao (){
        return this.descricao;
    }
    
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    
    public double getPreco (){
        return this.preco;
    }
    
    public void setPreco (double preco){
        this.preco = preco;
    }
}
