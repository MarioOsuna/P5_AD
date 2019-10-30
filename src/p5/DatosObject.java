/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Usuario
 */
public class DatosObject {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
      //  Persona persona;//defino variable persona
   
   File fichero = new File("Datos.dat");//declara el fichero
   ObjectOutputStream dataOS;
   
   /*FileOutputStream fileout = new FileOutputStream(fichero,true);  //crea el flujo de salida
    //conecta el flujo de bytes al flujo de datos
   ObjectOutputStream dataOS = new ObjectOutputStream(fileout);  */
   
   //si el fichero no existe crea el ObjectOutputStream
   if(!fichero.exists())
   {
        
       FileOutputStream fileout= new FileOutputStream(fichero);
        dataOS=new ObjectOutputStream(fileout);
   }
   
   else
   {
      dataOS=new MiObjectOutputStream(new FileOutputStream(fichero, true));
   }
   
   int codigo[]={11,12,13,14,15,16,17,18};
          String producto[]={"PC","MONITOR","TECLADO","RATÓN","PENDRIVE","CABLEAVG","CABLEHDMI","PROYECTOR"};
          double precio[]={1022.57,50.15,10.22,2.75,30.20,5.30,10.22,1002.87};
   
   System.out.println("GRABANDO DATOS.");      
   for (int i=0;i<codigo.length; i++){ //recorro los arrays
       Producto productos = new Producto(codigo[i],producto[i],precio[i]); //creo el producto	  
	  dataOS.writeObject(productos); //escribo la persona en el fichero
	  System.out.println("GRABO LOS DATOS DE UN PRODUCTO.");  
   }     
   dataOS.close();  //cerrar stream de salida 
    }
}
