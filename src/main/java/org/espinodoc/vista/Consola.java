package org.espinodoc.vista;

import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.SolicitaDatos;
import org.espinodoc.model.figura.*;
import org.espinodoc.util.ReadUtil;
import org.espinodoc.util.FiguraFactory;


public class Consola implements Ejecutable, org.espinodoc.vista.Ejecutable {
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

    @Override
    public void imprimir() {

    }

    @Override
    public void addFigura(Figura figura) {

    }
}
