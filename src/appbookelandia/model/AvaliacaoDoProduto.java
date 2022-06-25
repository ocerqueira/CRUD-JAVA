
package appbookelandia.model;

public class AvaliacaoDoProduto {
    /*atributos*/
    private int codigoDoProduto;
    private String codigoDoCliente;
    private int nota;
    private String descricao;
    
    
    /*construtor*/
    public AvaliacaoDoProduto() {
    }

    public AvaliacaoDoProduto(int codigoDoProduto, String codigoDoCliente, int nota) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
        this.nota = nota;
    }

    public AvaliacaoDoProduto(int codigoDoProduto, String codigoDoCliente, int nota, String descricao) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
        this.nota = nota;
        this.descricao = descricao;
    }
    
    

    /*encapsulamento*/
    /**
     * @return the codigoDoProduto
     */
    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    /**
     * @param codigoDoProduto the codigoDoProduto to set
     */
    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    /**
     * @return the codigoDoCliente
     */
    public String getCodigoDoCliente() {
        return codigoDoCliente;
    }

    /**
     * @param codigoDoCliente the codigoDoCliente to set
     */
    public void setCodigoDoCliente(String codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
