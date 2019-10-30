/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Producto implements Serializable{
    private int codigo;
    private String producto;    
    private Double precio;
    
    public Producto(int cod,String producto, Double precio) {
        this.codigo=cod;
        this.producto=producto;
        this.precio=precio;
    }
     public Producto()
    {
        this.producto=null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
     
    
}
