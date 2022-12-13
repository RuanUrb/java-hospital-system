
package oop6;

import gui.PainelLogin;
import java.util.ArrayList;


public class Sistema {
    ArrayList<Funcionario> lista_funcionarios;
    ArrayList<Paciente> lista_pacientes;
    
    public Sistema(){
       lista_funcionarios = new ArrayList<>();
       lista_pacientes = new ArrayList<>();
        
    }
    
    public void adiciona(Funcionario novo_funcionario){
        this.lista_funcionarios.add(novo_funcionario);
    }
    
    public void adiciona(Paciente novo_paciente){
        this.lista_pacientes.add(novo_paciente);
    }
    
    public Paciente procura_lista_pacientes(String email, String password){
        for(Paciente paciente : lista_pacientes){
            if(paciente.getEmail().compareTo(email) == 0){
                return paciente;
            }
        }
        return null;
    }
    
    public Funcionario procura_lista_funcionarios(String email, String password){
        for(Funcionario funcionario : lista_funcionarios){
            if(funcionario.getEmail().compareTo(email) == 0 && funcionario.getPassword().compareTo(password) ==0){
                return funcionario;
            }
        }
        return null;
    }
    
    public void iniciar(){
        PainelLogin painel_login = new PainelLogin();
        painel_login.setVisible(true);
    }
    
    
    
}
