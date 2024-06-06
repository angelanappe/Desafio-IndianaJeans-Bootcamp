package cl.praxis.model;

import java.util.ArrayList;

public class ProductoServicio {
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
}


