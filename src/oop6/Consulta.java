
package oop6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Consulta {
    private String nome_paciente, sala, razao, nome_medico;
    private LocalDate data;
    private float valor;
    int id;
    
    public Consulta(String nome_paciente, String sala, String razao, String nome_medico, LocalDate data, float valor){
        this.nome_paciente = nome_paciente;
        this.sala = sala;
        this.razao = razao;
        this.nome_medico = nome_medico;
        this.data = data;
        this.valor = valor;
        data = LocalDate.now();
    }
    
    public String get_nome_medico(){
        return this.nome_medico;
    }
    
    public LocalDate get_data(){
        return this.data;
    }
    
    public String get_sala(){
        return this.sala;
    }
    
    public String get_nome_paciente(){
        return this.nome_paciente;
    }
    
    public float get_valor(){
        return this.valor;
    }
    
    public void setID(int number){
        this.id = number;
    }
    
    public int getID(){
        return this.id;
    }
    
    public Consulta(){
    data = LocalDate.now();
    }
}
