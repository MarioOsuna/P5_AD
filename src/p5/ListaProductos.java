/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author Usuario
 * 
 */
import java.util.ArrayList;
import java.util.List;
public class ListaProductos {
    private List<Producto> lista = new ArrayList<Producto>();
    
    public ListaProductos(){    	
    }

    public void add(Producto per) {
            lista.add(per);
    }
   
   public List<Producto> getListaProductos() {
            return lista;
    }

}
