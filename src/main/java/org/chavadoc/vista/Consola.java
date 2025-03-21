package org.chavadoc.vista;

import org.chavadoc.model.figura.*;
import org.chavadoc.util.ReadUtil;
import org.chavadoc.util.FiguraFactory;
import org.gerdoc.historial.Historiales;
import org.chavadoc.model.figura.Figura;
import org.chavadoc.vista.Ejecutable;
import org.chavadoc.vista.SolicitaDatos;


public class Consola implements Ejecutable, org.gerdoc.vista.Ejecutable {
    private static Consola consola;
    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if(consola==null)
        {
            return new Consola();
        }
        return consola;
    }

    @Override
    public void run( )
    {
        boolean flag = true;
        int opcion = 0;
        FiguraEnum figuraEnum = null;
        Figura figura = null;
        while( flag )
        {
            Menu.principal( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );

            figuraEnum = FiguraEnum.getFiguraEnumById( opcion );

            if( FiguraEnum.SALIR.equals( figuraEnum ) )
            {
                flag = false;
            }
            if( FiguraEnum.OPCION_ERRONEA.equals( figuraEnum ) )
            {
                Menu.opcionInvalida( );
            }

            figura = FiguraFactory.getFiguraByFiguraEnum( figuraEnum );
            if( figura != null )
            {
                ((SolicitaDatos)figura).leeDatos( );
                Menu.calcula( figura );
            }
        }

    }

    @Override
    public void addHistoriales(Historiales historiales) {

    }
}
