package org.chavadoc.historial;

import org.espinodoc.historial.Historiales;
import org.gerdoc.model.figura.Figura;

import java.util.ArrayList;
import java.util.List;

public class Historia extends org.gerdoc.historial.Historia implements Historiales
{
    private static org.chavadoc.historial.Historia historia;
    private List<Figura> list;

    private Historia()
    {
        super();
    }

    public static org.chavadoc.historial.Historia getInstance( )
    {
        if( historia == null )
        {
            historia = new org.chavadoc.historial.Historia( );
        }
        return historia;
    }

    @Override
    public void imprimir()
    {
        if( list == null || list.isEmpty( ) )
        {
            System.out.println( "lista vacia");
            return;
        }
        list.forEach( f -> {
            System.out.println( "el perimetro es:" + f.perimetro( ) );
            System.out.println( "el area es:" + f.area( ) );
        });
    }

    @Override
    public void addFigura(Figura figura)
    {
        if( list == null)
        {
            list = new ArrayList<>( );
        }
        list.add( figura );
    }
}
