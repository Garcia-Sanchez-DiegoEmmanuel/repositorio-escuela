package org.chavadoc.util;

import java.util.ArrayList;
import java.util.List;

public class HistorialFiguras {
    private static HistorialFiguras instance;
    private List<String> historial;

    private HistorialFiguras() {
        historial = new ArrayList<>();
    }

    public static HistorialFiguras getInstance() {
        if(instance == null) {
            instance = new HistorialFiguras();
        }
        return instance;
    }

    public void agregarFigura(String figuraInfo) {
        historial.add(figuraInfo);
    }

    public void mostrarHistorial() {
        System.out.println("\n=== Historial de Figuras ===");
        if(historial.isEmpty()){
            System.out.println("No hay figuras registradas.");
        } else {
            for(String info : historial) {
                System.out.println(info);
            }
        }
        System.out.println("============================\n");
    }
}
