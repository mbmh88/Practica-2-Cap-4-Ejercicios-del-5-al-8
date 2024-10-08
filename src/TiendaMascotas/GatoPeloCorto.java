package TiendaMascotas;

public class GatoPeloCorto extends Gato{
    public GatoPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
    }
    public static class AzulRuso extends GatoPeloCorto{
        public AzulRuso(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
            super(nombre, edad, color, alturaSalto, longitudSalto);
        }
    }
}
