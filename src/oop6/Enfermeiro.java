
package oop6;

public class Enfermeiro extends Funcionario{
    
    public Enfermeiro(String nome, String email, String password, long cpf, float salario){
        super(nome, cpf, salario, email, password);
    }
}
