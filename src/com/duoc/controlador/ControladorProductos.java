package com.duoc.controlador;

import com.duoc.modelo.CategoriaProducto;
import com.duoc.modelo.Producto;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class ControladorProductos {

    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto, DefaultTableModel model){
        productos.add(producto);
        //TODO logica JDBC que hara in insert a la tabla producto
        model.addRow(new Object[]{producto.getNombre(), producto.getCategoria(), producto.getStock(), producto.getValor()});
    }

    public void editarProducto(int index, Producto producto, DefaultTableModel model){
        productos.set(index, producto);
        model.setValueAt(producto.getNombre(), index, 0);
        model.setValueAt(producto.getCategoria(), index, 1);
        model.setValueAt(producto.getStock(), index, 2);
        model.setValueAt(producto.getValor(), index, 3);
    }

    public void eliminarProducto(int index, DefaultTableModel model){
        productos.remove(index);
    }

    public void cargarEjemplos(DefaultTableModel model){
        agregarProducto(new Producto("Tomate", CategoriaProducto.FRUTA, 50, 890),model);
        agregarProducto(new Producto("Papa", CategoriaProducto.TUBERCULO, 50, 890),model);
        agregarProducto(new Producto("Zanahoria", CategoriaProducto.HORTALIZA, 50, 890),model);
        agregarProducto(new Producto("Lechuga", CategoriaProducto.VERDURA, 50, 890),model);
    }

}
