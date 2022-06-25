package appbookelandia.model;

public class CategoriaDoProduto {
    /*atributos*/
    private int codigo;
    private String nome;
    private String descricao;
    
    /*construtor*/
    
 

    public CategoriaDoProduto(int codigo) {
        this.codigo = codigo;
    }

    public CategoriaDoProduto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public CategoriaDoProduto(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    /*encapsulamento*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
