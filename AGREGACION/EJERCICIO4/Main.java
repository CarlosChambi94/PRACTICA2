package AGREGACION.EJERCICIO4;

public class Main {
    public static void main(String[] args) {
        Ropero r1 = new Ropero("Madera", 10);
        Ropa c1= new Ropa("Remera", "Lana");
        Ropa c2= new Ropa("Chompa", "algodon");
        Ropa c3= new Ropa("Buso", "Seda");
        Ropa c4= new Ropa("Pantalon", "Cuero");
        Ropa c5= new Ropa("Gorro", "Plastico");

        Ropa[] lista = {c1, c2, c3, c5, c4};
        for (int i = 0; i < lista.length; i++) {
            r1.agregarRopa(lista[i]);
        }
        r1.mostrarRopero();
        System.out.println("************** ELIMINANDO REMERA  Y ALGODON **********");
        r1.eliminarPrendas("remera", "algodon");
        r1.mostrarRopero();
        r1.mostrarRopax("buso", "aluminio");

    }
}
