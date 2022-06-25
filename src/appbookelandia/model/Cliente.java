package appbookelandia.model;

import java.time.LocalDate;

public class Cliente {

    /*Atributos*/
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate dataDeCadastro;
    private String senha;

    /*construtor*/
    public Cliente() {
        this.setDataDeCadastro(LocalDate.now());
    }

    public Cliente(String cpf) {
        this.setDataDeCadastro(LocalDate.now());
        this.setCpf(cpf);
    }

    public Cliente(String cpf, String nome) {
        this.setDataDeCadastro(LocalDate.now());
        this.setCpf(cpf);
        this.setNome(nome);
    }

    /*Encapsulamento*/
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataDeCadastro() {
        return this.dataDeCadastro;
    }

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
