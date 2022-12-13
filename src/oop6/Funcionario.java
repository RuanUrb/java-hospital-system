
package oop6;


public abstract class Funcionario {
    protected String nome;
    protected int cod_funcionario;
    protected float salario;
    private String email, password;
    
    public Funcionario(){
        
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
}
