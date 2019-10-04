package concierto;

import instrumentos.Instrumento;

public class Interprete {
    
    private Instrumento obj_Instrumento;

    public void setMyInstrumento(Instrumento obj_Instrumento) {
        this.obj_Instrumento = obj_Instrumento;
    }

    public void afinarInstrumento(Instrumento obj_Instrumento) {
        obj_Instrumento.afinar();
    }

    public void tocarInstrumento(Instrumento obj_Instrumento) {
        obj_Instrumento.tocar();
    }

    public void mostrarInterprete(int i) {
        System.out.println("\nInterprete N° " + i);
        afinarInstrumento(obj_Instrumento);
        tocarInstrumento(obj_Instrumento);
    }
    
}