
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
    
    public void iniciar(){
        PainelLogin painel_login = new PainelLogin();
        painel_login.setVisible(true);
    }
    
    
    
}
