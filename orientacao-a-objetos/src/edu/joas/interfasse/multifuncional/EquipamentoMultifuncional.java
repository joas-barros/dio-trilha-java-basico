package edu.joas.interfasse.multifuncional;

import edu.joas.interfasse.copiadora.Copiadora;
import edu.joas.interfasse.digitalizadora.Digitalizadora;
import edu.joas.interfasse.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("Copiando via Equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("Digitalizando via Equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("Imprimindo via Equipamento Multifuncional");
    }
    
}
