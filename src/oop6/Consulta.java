
package oop6;

import java.util.Date;


public class Consulta {
    private String nome_paciente, sala, enfermidade, nome_medico;
    
    private Date data;
    private float valor;
    
    public Consulta(String nome_paciente, String sala, String enfermidade, String nome_medico, Date data, float valor){
        this.nome_paciente = nome_paciente;
        this.sala = sala;
        this.enfermidade = enfermidade;
        this.nome_medico = nome_medico;
        this.data = data;
        this.valor = valor;
    }
}
