package TiendaMascotas;

public class GatoPeloLargo extends Gato{
    public GatoPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
    public static class Angora extends GatoPeloLargo{
        public Angora(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
            super(nombre, edad, color, alturaSalto, longitudSalto);
        }
    }
}
