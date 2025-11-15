package AGREGACION.EJERCICIO12;

public class Hospital {
    private String nombre;
    private Doctor[] doctor;
    private int nd;

    public Hospital(String nombre, int maximacantidad) {
        this.nombre = nombre;
        this.doctor= new Doctor[maximacantidad];
        this.nd=0;
    }

    public void agregarDoctor(Doctor d ){
        this.doctor[nd]=d;
        nd++;
    }

    public void mostrardoctores(){
        System.out.println("Hospital:" + nombre );
        for(int i = 0 ; i < nd ; i++){
            if(doctor[i] !=null){
                doctor[i].mostrardoctor();
            }
        }
    }
}
