import javax.swing.*;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Producto implements Descuento{
    private int Id = 0;
    private String Nombre;
    private float Precio;
    private int descuento;

    Scanner leer = new Scanner(System.in);

     ArrayList<Producto> productos;

    private int contador = 1;

    public Producto(String nombre, float precio) {
        this.Id = contador++;
        this.Nombre = nombre;
        this.Precio = precio;
        this.descuento = 0;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public  double calcularDescuento(int descuento) {
       return  getPrecio() * (descuento/10);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                ", descuento=" + descuento +
                ", contador=" + contador +
                '}';
    }
    void crearProducto(Producto producto) {
    }
    void ActualizarProducto( int  idProducto){}
    void eliminarProducto(Producto producto){}
    void mostrarProducto(Producto producto){}
    void listarProductos(){}


}
