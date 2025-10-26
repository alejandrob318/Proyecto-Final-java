public class Articulo extends Producto   {
    private int stock;
    private Categoria Genero;



    public Articulo(String nombre, float precio, int stock, Categoria genero) {
        super(nombre, precio);
        this.stock = stock;
        Genero = genero;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getGenero() {
        return Genero;
    }

    public void setGenero(Categoria genero) {
        Genero = genero;
    }

    @Override
    void crearProducto(Producto producto) {
           this.productos.add(producto);
    }

    @Override
    void ActualizarProducto(int  idProducto) {
        for (Producto producto1 : productos) {
            if(producto1.getId() == idProducto) {
                productos.remove(producto1);
            }
        }
    }

    @Override
    void eliminarProducto(Producto producto) {
        producto.getId();

    }

    @Override
    void mostrarProducto(Producto producto) {
        producto.toString();
    }
    @Override
    void listarProductos() {
        for (Producto producto1 : productos) {
            System.out.println(producto1.toString());
        }
    }


}
