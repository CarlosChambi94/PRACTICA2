package AGREGACION.EJERCICIO8;

public class Sistema {
    private Facultad[] facultades;
    private Fraternidad[] fraternidades ;
    private Bailarin[] bailarines;
    public int cantfac = 0 , cantFrat = 0, cantBaila= 0;

    public Sistema(int maxFac, int maxFrat, int maxBail) {
        facultades = new Facultad[maxFac];
        fraternidades = new Fraternidad[maxFrat];
        bailarines = new Bailarin[maxBail];
    }

    public void registrarFacultad(Facultad f){
        if(cantfac < facultades.length){
            facultades[cantfac++] = f;
        }
    }

    public void registrarFraternidad(Fraternidad f) {
        if (cantFrat < fraternidades.length) {
            fraternidades[cantFrat++] = f;
        }
    }

    public void registrarBailarin(Bailarin b) {
        if (cantBaila < bailarines.length) {
            bailarines[cantBaila++] = b;
        }
    }
    public void mostrarFraternidades() {
        for (int i = 0; i < cantFrat; i++) {
            fraternidades[i].mostrarInf();
        }
    }

    public void mostrarBailarines() {
        System.out.println(" Lista de Bailarines ");
        for (int i = 0; i < cantBaila; i++) {
            bailarines[i].mostrar();
        }
    }


}
