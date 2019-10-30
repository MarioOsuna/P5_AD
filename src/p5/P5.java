/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.thoughtworks.xstream.XStream;

/**
 *
 * @author Usuario
 */
public class P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   throws IOException, ClassNotFoundException {   	
    
        File fichero = new File("Datos.dat");
    FileInputStream filein = new 
               FileInputStream(fichero);//flujo de entrada   
    //conecta el flujo de bytes al flujo de datos
    ObjectInputStream dataIS = new ObjectInputStream(filein);      
    System.out.println("Comienza el proceso de creación del fichero a XML ...");
				
    //Creamos un objeto Lista de Personas
    ListaProductos listaper = new ListaProductos();	 
     
    try {
      while (true) { //lectura del fichero
          //leer una Producto
	    Producto productos= (Producto) dataIS.readObject();    
	    listaper.add(productos); //añadir productos a la lista  
      }	
    }catch (EOFException eo) {}
    dataIS.close();  //cerrar stream de entrada     
    
    try {
		XStream xstream = new XStream();   
		//cambiar de nombre a las etiquetas XML
		xstream.alias("ListaDeProductos",ListaProductos.class);	
		xstream.alias("DatosProducto",Producto.class);
		
		//xstream.aliasField("Nombre alumno", Producto.class, "nombre");
		//xstream.aliasField("Edad alumno", Producto.class, "edad");
		
		//quitar etiqueta lista (atributo de la claseListaPersonas)
		xstream.addImplicitCollection(ListaProductos.class, "lista");
		//Insertar los objetos en el XML
	      xstream.toXML(listaper, new FileOutputStream("Productos.xml"));	
		System.out.println("Creado fichero XML....");
	
     }catch (Exception e) 
	   {e.printStackTrace();}	  
    }
    
}
