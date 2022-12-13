
package oop6;


public class DummyDB {
    public DummyDB(Sistema sistema){
        Funcionario medico = new Medico("Ze", "ze@gmail.com", "pica123", 4436611778L, 15000, "Crmaleatorio");
        Funcionario enfermeiro = new Enfermeiro("elias", "elias@gmail.com", "comce", 44633117878L, 5000);
        Funcionario admin = new Admin("carlos", "carlinhosfederal@gmail.com", "natmars", 15568812378L, 3000);
        Paciente paciente = new Paciente("juninho", "baseadoN@gmail.com", "tatata123", 16714514299L);
        sistema.adiciona(enfermeiro);
        sistema.adiciona(medico);
        sistema.adiciona(admin);
        sistema.adiciona(paciente);
    }
}
