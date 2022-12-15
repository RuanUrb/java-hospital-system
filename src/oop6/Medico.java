
package oop6;

public class Medico extends Funcionario{
    private String CRM;
    
    public Medico(String nome, String email, String password, long cpf, float salario, String crm){
        super(nome, cpf, salario, email, password);
        this.CRM = crm;
    }
    
    public Medico(){
    
}
    
    public String getCRM(){
        return this.CRM;
    }
    
}
