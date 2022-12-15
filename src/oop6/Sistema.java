
package oop6;

import gui.PainelLogin;
import java.util.ArrayList;


public class Sistema {
    public ArrayList<Funcionario> lista_funcionarios;
    public ArrayList<Paciente> lista_pacientes;
    public ArrayList<Consulta> lista_consultas;
    public ArrayList<Atestado> lista_atestados;
     
    public Sistema(){
       lista_funcionarios = new ArrayList<>();
       lista_pacientes = new ArrayList<>();
       lista_consultas = new ArrayList<>();
       lista_atestados = new ArrayList<>();
        
    }
    
    public void adiciona(Funcionario novo_funcionario){
        novo_funcionario.set_codF(lista_funcionarios.size()+1);
        this.lista_funcionarios.add(novo_funcionario);
    }
    
    public void adiciona(Paciente novo_paciente){
        novo_paciente.set_codP(lista_pacientes.size()+1);
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
    
    public void deletar_consulta(int index){
        this.lista_consultas.remove(index);
    }
    
    public void adiciona(Atestado novo_atestado){
        novo_atestado.setID(lista_atestados.size()+1);
        this.lista_atestados.add(novo_atestado);
    }
    
    public void adiciona(Consulta nova_consulta){
        int tamanho = lista_consultas.size();
        if(tamanho == 0){
            nova_consulta.setID(1);
        }
        else{
            nova_consulta.setID(lista_consultas.get(tamanho-1).getID()+1);
        }
        //nova_consulta.setID(lista_consultas.get(lista_consultas.size()-1).getID()+1);
        this.lista_consultas.add(nova_consulta);
    }
    
    public Funcionario procura_lista_funcionarios(String email, String password){
        for(Funcionario funcionario : lista_funcionarios){
            if(funcionario.getEmail().compareTo(email) == 0 && funcionario.getPassword().compareTo(password) ==0){
                return funcionario;
            }
        }
        return null;
    }
    
    public void carrega_listas(ArrayList<Funcionario> nova_lista_funcionarios, ArrayList<Paciente> nova_lista_pacientes){
        this.lista_funcionarios = nova_lista_funcionarios;
        this.lista_pacientes = nova_lista_pacientes;
        
    }
    
    public void carrega_listas_medicas(ArrayList<Consulta> nova_lista_consultas, ArrayList<Atestado> nova_lista_atestados){
        this.lista_consultas = nova_lista_consultas;
        this.lista_atestados = nova_lista_atestados;
    }
    
    public void iniciar(){
        PainelLogin painel_login = new PainelLogin();
        painel_login.setVisible(true);
        painel_login.system_load_list(this.lista_funcionarios, this.lista_pacientes);
        painel_login.sistema_painel.carrega_listas_medicas(this.lista_consultas, this.lista_atestados);

    }
    
    
    
}
