package AGREGACION.EJERCICIO4;

public class Ropero {
    public String material;
    public int nroRopas;
    Ropa[] ropas;

    public Ropero(String material, int nroRopas) {
        this.material = material;
        this.nroRopas = nroRopas;
        this.ropas=new Ropa[nroRopas];
    }

    public void agregarRopa(Ropa r){
        for(int i = 0; i < ropas.length ; i++){
            if(ropas[i] == null){
                ropas[i] = r;
                break;
            }
        }
    }
    public void mostrarRopero(){
        for(int i = 0 ; i < ropas.length ; i++){
            if(ropas[i] !=null){
                System.out.println(" - " + ropas[i]);
            }
        }
    }

    public void eliminarPrendas(String t1, String t2) {
        for (int i = 0; i < ropas.length; i++) {
            if (ropas[i] != null) {
                if (ropas[i].getTipo().equalsIgnoreCase(t1) || ropas[i].getMaterial().equalsIgnoreCase(t2)) {
                    ropas[i] = null;
                }
            }
        }
    }

    public void mostrarRopax(String t1, String t2) {
        for (int i = 0; i < ropas.length; i++) {
            if (ropas[i] != null) {
                if (ropas[i].getTipo().equalsIgnoreCase(t1) || ropas[i].getMaterial().equalsIgnoreCase(t2)) {
                    System.out.println("Encontrado: ");
                    System.out.println(" - " + ropas[i]);
                }
            }
        }
    }


}
