
package oop6;

import java.util.ArrayList;


public class Paciente {
    private String nome;
    private int cod_paciente;
    private long cpf;
    private String email, password;
    ArrayList<Consulta> consultas_paciente;
    
    public Paciente(String nome, String email, String password, long cpf){
        consultas_paciente = new ArrayList<>();
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
    }
    
    public Paciente(){
        consultas_paciente = new ArrayList<>();
    }
    
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public long getCPF(){
        return this.cpf;
    }
}