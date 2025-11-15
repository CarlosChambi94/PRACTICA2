package AGREGACION.EJERCICIO12;

public class Main {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Juan XXII", 10);
        Hospital h2 = new Hospital("Materno infantil", 50);
        Doctor d1 = new Doctor("Polo", "Cirujano");
        Doctor d2 = new Doctor("Maria", "cardiologo ");
        Doctor d3 = new Doctor("Luis", "Dermatologo");
        Doctor d4 = new Doctor("Abel", "Neumólogo");

        h1.agregarDoctor(d1);
        h1.agregarDoctor(d2);
        h2.agregarDoctor(d3);
        h2.agregarDoctor(d4);
        h1.mostrardoctores();
        h2.mostrardoctores();

    }
}
