package main;

import concierto.Banda;
import concierto.Interprete;
import java.util.ArrayList;

public class Cliente {

    public static void main(String[] args) {
        
        Banda organizacion = new Banda();
        organizacion.crearBanda();
        
        ArrayList<Interprete> interprete = organizacion.getBanda();
        int i = 1;
        for (Interprete next : interprete) {
            next.mostrarInterprete(i);
            i++;
        }
    }    

    
}
