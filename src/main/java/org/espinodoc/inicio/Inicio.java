package org.espinodoc.inicio;

import org.gerdoc.vista.Ejecutable;
import org.espinodoc.util.ReadUtil;
import org.espinodoc.vista.Consola;
import org.espinodoc.vista.Menu;
import org.espinodoc.vista.Ventana;

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