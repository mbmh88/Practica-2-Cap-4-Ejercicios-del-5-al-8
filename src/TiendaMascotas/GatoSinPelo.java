package TiendaMascotas;

public class GatoSinPelo extends Gato{
    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
    public static class Esfinge extends GatoSinPelo{
        public Esfinge(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
            super(nombre, edad, color, alturaSalto, longitudSalto);
        }
    }
}
