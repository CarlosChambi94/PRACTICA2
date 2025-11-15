package AGREGACION.EJERCICIO10;

public class Participante extends Persona{
    public int nroTicket;

    public Participante(String apellido, String nombre, int edad, int ci, int nroTicket) {
        super(apellido, nombre, edad, ci);
        this.nroTicket = nroTicket;
    }

    public int getNroTicket() {
        return nroTicket;
    }

    public void mostrar() {
        System.out.println("Participante: " + nombre + " " + apellido +
                " - Ticket: " + nroTicket);
    }
}
