package cl.praxis.model;

import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio = new ProductoServicio();
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu(){
        while (true) {
            System.out.println("1 Listar Producto");
            System.out.println("2 Agregar Producto");
            System.out.println("3 Exportar Datos");
            System.out.println("4 Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if(productoServicio.getListaProductos().isEmpty()){
                        System.out.println("Aún no has agregado ningún producto.\n");
                    } else {
                        productoServicio.listarProductos();
                    }
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    exportarDatos();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Ingrese una opción válida.");

            }
        }
    }

    private void agregarProducto() {
        Producto producto = new Producto();
        System.out.print("Ingresar nombre articulo: ");
        producto.setArticulo(sc.nextLine());
        System.out.print("Ingresa precio: ");
        producto.setPrecio(sc.nextLine());
        System.out.print("Ingresa descripción: ");
        producto.setDescripcion(sc.nextLine());
        System.out.print("Ingresa código: ");
        producto.setCodigo(sc.nextLine());
        System.out.print("Ingresa talla: ");
        producto.setTalla(sc.nextLine());
        System.out.print("Ingresa marca: ");
        producto.setMarca(sc.nextLine());
        System.out.print("Ingresa color: ");
        producto.setColor(sc.nextLine());

        productoServicio.agregarProducto(producto);
    }

    private void exportarDatos() {
        ExportarTxt exportador = new ExportarTxt();
        exportador.exportar(productoServicio.getListaProductos());
        System.out.println("Se exportaron los datos correctamente.");
    }
}
