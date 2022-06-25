package appbookelandia.model;

import java.time.LocalDate;

public class Funcionario {
    protected int matricula;
    protected String nome;
    protected LocalDate dataDeAdmissao;
    protected String cargo;
    protected double salario;
    protected Chamado chamados;

    protected Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario() {
        }

    public String getCargo() {
        return cargo;
    }

    public void setMatricula(Object txtMatricula) {
        }

    public void setNome(String text) {
        }

    public void setDataAdmissao(String text) {
         }

    public void setSalario(String text) {
    }
}
