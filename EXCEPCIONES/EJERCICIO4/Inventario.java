package EXCEPCIONES.EJERCICIO4;

public class Inventario {
    private Producto[] producto;
    private int nroProductos;

    public Inventario(int cantP) {
        this.producto = new Producto[cantP];
        this.nroProductos = 0;

    }

    public void agregarProducto(Producto p) throws CodigoException{

        if(p.getStock() < 0 || p.getPrecio() < 0){
            throw new CodigoException("El precio o el stock son negativos");
        }

        for(int i = 0 ; i < nroProductos ; i++){
            if(producto[i].getCodigo().equalsIgnoreCase(p.getCodigo())){
                throw new CodigoException("El codigo ya existe");
            }
        }
        this.producto[nroProductos] = p;
        nroProductos++;

    }

    public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException{
        for(int i = 0 ; i < nroProductos ; i++){
            if(producto[i].getCodigo().equalsIgnoreCase(codigo)){
                return producto[i];
            }
        }
        throw new ProductoNoEncontradoException("El código " + codigo + " no existe.");

    }

    public void venderProducto(String codigo, int cantidad) throws ProductoNoEncontradoException, StockInsuficienteException{
        Producto p = buscarProducto(codigo);
        if(cantidad > p.getStock()){
            throw new ProductoNoEncontradoException("No hay suficiente stock ") ;
        }
        p.reducirStock(cantidad);

    }


}
