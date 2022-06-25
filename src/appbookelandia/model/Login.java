package appbookelandia.model;

public class Login {
    /*atributos*/
    private String email;
    private String senha;
    private NivelDeAcesso nivelDeAcesso;
    private boolean status;
    
    
    /*construtor*/
    public Login (){}

    public Login(String email, String senha, NivelDeAcesso nivelDeAcesso, boolean status) {
        this.email = email;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
        this.status = status;
    }   

    
    /*encapsulamento*/
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSenha (){
        return this.senha = senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public NivelDeAcesso getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(NivelDeAcesso nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
    

       
}
