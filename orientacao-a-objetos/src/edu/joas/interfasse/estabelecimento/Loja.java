package edu.joas.interfasse.estabelecimento;

import edu.joas.interfasse.copiadora.Copiadora;
import edu.joas.interfasse.digitalizadora.Digitalizadora;
import edu.joas.interfasse.impressora.Impressora;
import edu.joas.interfasse.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
