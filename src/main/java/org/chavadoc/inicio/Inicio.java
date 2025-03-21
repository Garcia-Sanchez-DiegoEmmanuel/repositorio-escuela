package org.chavadoc.inicio;

import org.chavadoc.util.ReadUtil;
import org.chavadoc.vista.Consola;
import org.chavadoc.vista.Menu;
import org.chavadoc.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

public class Inicio {

    public Inicio() {
    }

    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        while( flag )
        {
            Menu.principal2( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            switch ( opcion )
            {
                case 1:
                    ejecutable = (Ejecutable) Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = (Ejecutable) Ventana.getInstance( );
                    break;
                case 3:
                    flag = false;
                    ejecutable = null;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.run( );
            }
        }
    }
}