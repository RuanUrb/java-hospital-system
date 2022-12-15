
package oop6;

import java.time.LocalDate;

public class Atestado {
    String nome_paciente, nome_medico, razao, crm;
    public LocalDate data;
    public int duracao_dias;
    int id;
    
    public Atestado(String nome_paciente, String nome_medico, String razao, String crm, int duracao){
        this.nome_paciente = nome_paciente;
        this.nome_medico = nome_medico;
        this.razao = razao;
        this.crm = crm;
        this.duracao_dias = duracao;
        this.data = LocalDate.now();
    }
    
    public String getNomePaciente(){
        return this.nome_paciente;
    }
    
    public void setID(int number){
        this.id = number;
    }
    
    public String getNomeMedico(){
        return this.nome_medico;
    }
    
    public String getRazao(){
        return this.razao;
    }
    
    public String getCRM(){
        return this.crm;
    }
    
    public Atestado(){
        this.data = LocalDate.now();
    }
    
}
