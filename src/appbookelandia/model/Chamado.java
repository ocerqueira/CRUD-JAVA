
package appbookelandia.model;

public class Chamado {
    /*atributos*/
    private int ticket;
    private StatusChamado statusChamado;
    private String codigoDoCliente;
    private int codigoDoFuncionario;
    private int codigoDoPedido;
    private String descricao;

    
    /*construtor*/
    public Chamado(int ticket) {
        this.ticket = ticket;
    }

    public Chamado(int ticket, String codigoDoCliente, int codigoDoFuncionario, int codigoDoPedido) {
        this.ticket = ticket;
        this.codigoDoCliente = codigoDoCliente;
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.codigoDoPedido = codigoDoPedido;
    }
    
    
    /*encapsulamento*/
    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public StatusChamado getStatusChamado() {
        return statusChamado;
    }

    public void setStatusChamado(StatusChamado statusChamado) {
        this.statusChamado = statusChamado;
    }

    public String getCodigoDoCliente() {
        return codigoDoCliente;
    }

    public void setCodigoDoCliente(String codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    public int getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(int codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public int getCodigoDoPedido() {
        return codigoDoPedido;
    }

    public void setCodigoDoPedido(int codigoDoPedido) {
        this.codigoDoPedido = codigoDoPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
}
