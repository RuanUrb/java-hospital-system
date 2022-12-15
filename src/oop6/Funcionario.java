
package oop6;


public class Funcionario {
    protected String nome;
    protected int cod_funcionario;
    protected long cpf;
    protected float salario;
    protected String email, password;
    
    public Funcionario(String nome, long cpf, float salario, String email, String password){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.email = email;
        this.password = password;
    }
    
    public Funcionario(){
        
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public int get_codF(){
        return this.cod_funcionario;
    }
    
    public void set_codF(int codigo){
        this.cod_funcionario = codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getSalario(){
        return this.salario;
    }
}
