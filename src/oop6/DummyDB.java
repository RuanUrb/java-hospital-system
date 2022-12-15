
package oop6;

import java.time.LocalDate;


public class DummyDB {
    public DummyDB(Sistema sistema){
        //declaracao exemplo
        Funcionario medico1 = new Medico("José", "ze@gmail.com", "jose123", 44366117788L, 20000, "8431284895SP");
        Funcionario medico2 = new Medico("Elias", "elias@gmail.com", "elias123", 74186912323L, 15000, "748613547PR");
        Funcionario enfermeiro = new Enfermeiro("Pedro", "pedro@gmail.com", "pedro123", 44633117878L, 3000);
        
        Funcionario admin = new Admin("Carlos", "carlos@gmail.com", "carlos123", 15568812378L, 6000);
        
        Paciente paciente1 = new Paciente("Junior", "junior@gmail.com", "junior123", 16714514299L);
        Paciente paciente2 = new Paciente("Leonardo", "leo@gmail.com", "leo123", 16714514299L);
        Paciente paciente3 = new Paciente("Maria", "maria@gmail.com", "maria123", 16714514299L);
        
        Atestado atestado1 = new Atestado("Junior", "José", "Febre", "4521321SP", 3);
        Atestado atestado2 = new Atestado("Leonardo", "José", "Pé de maracujá", "458123RJ", 15);
        
        
        Consulta consulta1 = new Consulta("Junior", "N103", "Infeccao", "José", LocalDate.now(), 200);
        Consulta consulta2 = new Consulta("Maria", "L102", "Dor de garganta", "Elias", LocalDate.now(), 150);
        Consulta consulta3 = new Consulta("Jonas", "M201", "Coceira", "Elias", LocalDate.now(), 100);
        
        
        //adiciona ao sistema
        sistema.adiciona(medico1);
        sistema.adiciona(medico2);
        sistema.adiciona(enfermeiro);
        sistema.adiciona(admin);
        
        sistema.adiciona(paciente1);
        sistema.adiciona(paciente2);
        sistema.adiciona(paciente3);
        
        sistema.adiciona(atestado1);
        sistema.adiciona(atestado2);
        sistema.adiciona(consulta1);
        sistema.adiciona(consulta2);
        sistema.adiciona(consulta3);
    }
}
