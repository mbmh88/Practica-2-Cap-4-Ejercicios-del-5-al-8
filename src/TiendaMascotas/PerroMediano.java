package TiendaMascotas;

public class PerroMediano extends Perro {
    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }

    public static class Colliew extends PerroMediano {
        public Colliew(String nombre, int edad, String color, double peso, boolean muerde) {
            super(nombre, edad, color, peso, muerde);
        }
    }
}
