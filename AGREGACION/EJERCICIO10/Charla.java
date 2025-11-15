package AGREGACION.EJERCICIO10;

public class Charla {
    public String lugar, nombreCharla;
    public Speaker speaker;
    public int np;
    public Participante[] participantes;

    public Charla(String lugar, String nombreCharla, Speaker speaker, int maxparticipantes) {
        this.lugar = lugar;
        this.nombreCharla = nombreCharla;
        this.speaker= speaker;
        this.np = 0;
        this.participantes = new Participante[maxparticipantes];
    }
    public String getNombreCharla(){
        return nombreCharla;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public int getNp() {
        return np;
    }
    public Participante getParticipante(int i) {
        return participantes[i];
    }

    public void agregarParticipante(Participante p) {
        if (np < participantes.length) {
            participantes[np++] = p;
        } else {
            System.out.println("No hay más espacio para participantes en la charla: " + nombreCharla);
        }
    }

    public void mostrar() {
        System.out.println("Charla: " + nombreCharla + " - Lugar: " + lugar);
        System.out.print("Speaker: ");
        speaker.mostrar();
        System.out.println("Participantes (" + np + "):");
        for (int i = 0; i < np; i++) {
            participantes[i].mostrar();
        }
        System.out.println();
    }
}
