package oop6;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        new DummyDB(sistema);
        sistema.iniciar();
    }

}
