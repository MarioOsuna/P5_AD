/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.thoughtworks.xstream.XStream;


/**
 *
 * @author Usuario
 */
public class LeerProductos {
    public static void main(String[] args) throws IOException {   	
	
    XStream xstream = new XStream();
	
    xstream.alias("ListaDeProductos", ListaProductos.class);		
    xstream.alias("DatosProducto", Producto.class);	
    xstream.addImplicitCollection(ListaProductos.class, "lista");
	
    ListaProductos listadoTodas = (ListaProductos) 
         xstream.fromXML(new FileInputStream("Productos.xml"));			
    System.out.println("Numero de Productos: " + 
         listadoTodas.getListaProductos().size());
			       
    List<Producto> listaProductos = new ArrayList<Producto>();
	listaProductos = listadoTodas.getListaProductos();
			        
    Iterator iterador = listaProductos.listIterator(); 
    while( iterador.hasNext() ) {
	    Producto p = (Producto) iterador.next(); 
	    System.out.printf("Código: "+p.getCodigo()+" Nombre: "+ p.getProducto()+", edad: "+p.getPrecio()+" \n");        
    }    
    System.out.println("Fin de listado .....");
 } //fin main

    
}
