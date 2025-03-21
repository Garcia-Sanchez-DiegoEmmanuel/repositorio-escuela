package org.espinodoc.model.figura;

import org.gerdoc.vista.SolicitaDatos;

/**
 * 
 */
public abstract class Figura extends org.gerdoc.model.figura.Figura implements SolicitaDatos
{

    /**
     * Default constructor
     */

    public Figura()
    {
    }

    /**
     * @return
     */
    public abstract double area( );

    /**
     * @return
     */
    public abstract double perimetro();
}