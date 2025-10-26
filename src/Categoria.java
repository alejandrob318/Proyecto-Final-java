import java.util.ArrayList;

public class Categoria {
    private int id;
    private String descripcion;

    ArrayList<Categoria> categorias;

    public Categoria() {

    }

    public Categoria(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Dejar el metodo para despues hacer buscar categoria luego lo ponemos como objeto

     void agregarCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }
    Categoria buscarCategoria(int id){
        for (Categoria categoria1 : this.categorias){
            if(categoria1.getId() == id) {
                return categoria1;
            }

        }
        return null;
    }

}
