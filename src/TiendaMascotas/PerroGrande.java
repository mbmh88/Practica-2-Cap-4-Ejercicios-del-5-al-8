package TiendaMascotas;

public class PerroGrande extends  Perro{
    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }
    public static class PastorAleman extends PerroGrande{
        public PastorAleman(String nombre, int edad, String color, double peso, boolean muerde) {
            super(nombre, edad, color, peso, muerde);
        }
    }

}
