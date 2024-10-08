package TiendaMascotas;

import javax.swing.plaf.PanelUI;

public class PerroPequeno extends Perro {
    public PerroPequeno(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }

    public static class Caniche extends PerroPequeno {
        public Caniche(String nombre, int edad, String color, double peso, boolean muerde) {
            super(nombre, edad, color, peso, muerde);
        }
    }
}