
package oop6;

public class Admin extends Funcionario{
    public Admin(String nome, String email, String password, long cpf, float salario){
        super(nome, cpf, salario, email, password);
    }
}
