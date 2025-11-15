package AGREGACION.EJERCICIO10;

public class Evento {
    public String nombre ;
    public int nc ;
    public Charla[] charlas;

    public Evento(String nombre, int maxCharla){
        this.nombre=nombre;
        this.charlas = new Charla[maxCharla];
        this.nc=0;

    }

    public void agregarCharla(Charla c){
        if(nc < charlas.length){
            charlas[nc] = c ;
            nc++;
        }else{
            System.out.println("No se puede agregar mas charlas ");
        }
    }

    public double edadPromedio() {
        int totalEdad = 0;
        int totalParticipantes = 0;
        for (int i = 0; i < nc; i++) {
            Charla charla = charlas[i];
            for (int j = 0; j < charla.getNp(); j++) {
                totalEdad += charla.getParticipante(j).getEdad();
                totalParticipantes++;
            }
        }
        return totalParticipantes > 0 ? (double) totalEdad / totalParticipantes : 0;
    }

    public boolean buscarpersona(String n, String ap){
        for (int i = 0; i < nc; i++) {
            Charla charla = charlas[i];
            if (charla.getSpeaker().getNombre().equalsIgnoreCase(n)
                    && charla.getSpeaker().getApellido().equalsIgnoreCase(ap)) {
                return true;
            }
            // Participantes
            for (int j = 0; j < charla.getNp(); j++) {
                Participante p = charla.getParticipante(j);
                if (p.getNombre().equalsIgnoreCase(n)
                        && p.getApellido().equalsIgnoreCase(ap)) {
                    return true;
                }
            }
        }
        return false;

    }

    public void elimianarci(int c){
        for(int i = 0 ; i < nc ; i++){
            if(charlas[i].getSpeaker().getCi()==c){
                for(int j = i ; j < nc-1;i++){
                    charlas[j] = charlas[j+i];

                }
                charlas[nc - 1] = null;
                nc--;
                i--;
            }
        }
    }
    public void ordenarCharlasPorParticipantes() {
        for (int i = 0; i < nc - 1; i++) {
            for (int j = 0; j < nc - i - 1; j++) {
                if (charlas[j].getNp() > charlas[j + 1].getNp()) {
                    Charla temp = charlas[j];
                    charlas[j] = charlas[j + 1];
                    charlas[j + 1] = temp;
                }
            }
        }
    }

    public void mostrar() {
        System.out.println("=== Evento: " + nombre + " ===");
        for (int i = 0; i < nc; i++) {
            charlas[i].mostrar();
        }
    }

}
