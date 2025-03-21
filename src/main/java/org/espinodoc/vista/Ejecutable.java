package org.espinodoc.vista;

import org.gerdoc.historial.Historiales;

public interface Ejecutable extends org.gerdoc.historial.Historiales
{
    void run( );
    void addHistoriales(Historiales historiales );
}