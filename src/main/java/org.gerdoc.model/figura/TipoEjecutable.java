package org.gerdoc.model.figura;

import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Ventana;

public enum TipoEjecutable
{
    CONSOLA( 1, Consola.getInstance() ),
    VENTANA( 2, Ventana.getInstance() ),
    SALIR( 3, null ),
    OPCION_ERRONEA( 4, null ),
    HISTORIAL(5, null ),
    CONSOLA_SALVADOR(6, org.chavadoc.vista.Consola.getInstance()),
    CONSOLA_FERNANDO(7, org.espinodoc.vista.Consola.getInstance()),
    VENTANA_SALVADOR(8, org.chavadoc.vista.Ventana.getInstance()),
    VENTANA_FERNANDO(9, org.espinodoc.vista.Ventana.getInstance());
    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable)
    {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId()
    {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById( int opcion )
    {
        switch( opcion )
        {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return HISTORIAL;
            case 4:
                return VENTANA_SALVADOR;
            case 5:
                return VENTANA_FERNANDO;
            case 6:
                return CONSOLA_SALVADOR;
            case 7:
                return CONSOLA_FERNANDO;
            case 8:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }

    public Ejecutable getEjecutable()
    {
        return ejecutable;
    }
}
