package TiendaMascotas;

public class Perro extends Mascota{
    private double peso;
    private boolean muerde;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }
    public static void sonido(){
        System.out.println("Los perros Ladran");
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Peso: "+peso+" Kg");
        System.out.println("Muerde?"+(muerde ?"Si":"No"));
    }
}
