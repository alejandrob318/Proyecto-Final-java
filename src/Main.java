import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void mostrarMenu() {
        System.out.println("1) Crear ");
        System.out.println("2) Listar ");
        System.out.println("3) Actualizar ");
        System.out.println("4) Eliminar ");
        System.out.println("0) Salir");
    }


        public static void main(String[] args) {
            int opcion;
        do {

            Scanner leer = new Scanner(System.in);
            ArrayList<Articulo> articulos = new ArrayList<>();
            ArrayList<Categoria> categorias = new ArrayList<>();
            Categoria categoria = new Categoria();
            mostrarMenu();
            categorias.add(new Categoria(1,"ram"));
            categorias.add(new Categoria(2,"procesadores"));
            categorias.add(new Categoria(3,"motherboard"));
            System.out.println("ingrese la opcion");
             opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                     System.out.println("ingrese nombre del producto");
                     String nombre = leer.next();
                     System.out.println("ingrese precio del producto");
                     float precio = leer.nextFloat();
                     System.out.println("ingrese cantidad del producto");
                     int stock = leer.nextInt();
                     System.out.println("ingrese categoria del producto");
                     int genero = leer.nextInt();
                     categoria.buscarCategoria(genero);

                     Articulo articulo = new Articulo(nombre,precio,stock,categoria.buscarCategoria(genero));

                     articulos.add(articulo);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while (opcion != 0);



        }
}