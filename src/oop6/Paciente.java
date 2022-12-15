
package oop6;

import java.util.ArrayList;


public class Paciente {
    private String nome;
    private int cod_paciente;
    private long cpf;
    private String email, password;
    
    public Paciente(String nome, String email, String password, long cpf){
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
    }
    
    public Paciente(){

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
    
    public int get_codP(){
        return this.cod_paciente;
    }
    
    public void set_codP(int codigo){
        this.cod_paciente = codigo;
    }
}