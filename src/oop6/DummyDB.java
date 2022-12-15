
package oop6;

import java.time.LocalDate;


public class DummyDB {
    public DummyDB(Sistema sistema){
        Funcionario medico = new Medico("Ze", "ze@gmail.com", "pica123", 4436611778L, 15000, "1234124SP");
        Funcionario enfermeiro = new Enfermeiro("elias", "elias@gmail.com", "comce", 44633117878L, 5000);
        Funcionario admin = new Admin("carlos", "carlinhosfederal@gmail.com", "natmars", 15568812378L, 3000);
        Paciente paciente = new Paciente("juninho", "baseadoN@gmail.com", "tatata123", 16714514299L);
        Atestado atestado1 = new Atestado("juninho", "Ze", "caganeira", "4521321SP", 3);
        Atestado atestado2 = new Atestado("juninho", "Clodoaldo", "pe de maracuja", "458123RJ", 15);
        Consulta consulta1 = new Consulta("juninho", "N103", "ejaculacao precoce", "Lucia",LocalDate.now(), 200);
        Consulta consulta2 = new Consulta("juninho", "L102", "cagarreia", "Andre", LocalDate.now(), 300);
        Consulta consulta3 = new Consulta("jonas", "N123", "coceira", "Ze", LocalDate.now(), 500);
        sistema.adiciona(enfermeiro);
        sistema.adiciona(medico);
        sistema.adiciona(admin);
        sistema.adiciona(paciente);
        sistema.adiciona(atestado1);
        sistema.adiciona(atestado2);
        sistema.adiciona(consulta1);
        sistema.adiciona(consulta2);
        sistema.adiciona(consulta3);
    }
}
