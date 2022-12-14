
package oop6;


public class Paciente {
    private String nome;
    private int cod_paciente;
    private long cpf;
    private String email, password;
    
    public Paciente(String nome, String email, String password, long cpf){
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
    }
    
    public Paciente(){
        
    }
    
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public long getCPF(){
        return this.cpf;
    }
}