
package appbookelandia.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    /*atributos*/
    private int numeroDoPedido;
    private Cliente cliente;
    private FormaDePagamento formaDePagamento;
    private StatusDoPedido status;
    private LocalDate data;
    private String cupom;
    private double valorTotal;
    private ArrayList<ProdutosDoPedido> produtos;
    
    
    /*construtor*/
    
   public Pedido() {
        this.produtos = new ArrayList<ProdutosDoPedido>();
    }
    
    public Pedido(int numeroDoPedido){
        this.numeroDoPedido = numeroDoPedido;
        this.produtos = new ArrayList<ProdutosDoPedido>();
    }
    
    public void adicionaProduto (Produtos p, int quantidade){
        ProdutosDoPedido produtosDoPedido = new ProdutosDoPedido (p, quantidade);
        this.produtos.add(produtosDoPedido);
    }
    
    public double calculaValorTotal () {
        double valorTotal = 0.0;
        for (ProdutosDoPedido pp : this.produtos) {
            Produtos p = pp.getProduto();
            int quantidade = pp.getQuantidade();
            valorTotal = valorTotal + (p.getPreco()* quantidade);
        }
        return valorTotal;
    }
    
    /*encapsulamento*/
    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }  
}


