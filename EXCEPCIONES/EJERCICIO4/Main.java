package EXCEPCIONES.EJERCICIO4;

public class Main {
    public static void main(String[] args) {
        Inventario i1 = new Inventario(10);
        Producto p1 = new Producto("AA", "Teclado", 50, 20);
        Producto p2 = new Producto("BB", "Mouse", 30, 10);
        Producto p3 = new Producto("AA", "Teclado mecanico", 80, 5);

        try{
            i1.agregarProducto(p1);
            i1.agregarProducto(p2);
            i1.agregarProducto(p3);
        }catch (CodigoException e){
            System.out.println("No se agrego debido a " + e.getMessage());
        }

        try{
            i1.buscarProducto("EE");
        } catch (ProductoNoEncontradoException e ){
            System.out.println("No se encontro debido a " + e.getMessage());
        }
        try {
            i1.venderProducto("AA", 10);
            System.out.println("Se realizo la compra");
            i1.venderProducto("AA", 123);
        }catch (ProductoNoEncontradoException  | StockInsuficienteException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}
