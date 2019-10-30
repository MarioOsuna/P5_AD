/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Usuario
 */
public class MiObjectOutputStream extends ObjectOutputStream {
    public MiObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }
    
    protected MiObjectOutputStream() throws IOException, SecurityException
    {
        super();
    }
    
    //redefinición del método de escribir la cabecera para que no haga nada
    protected void writeStreamHeader() throws IOException
    {
        
    }
}
