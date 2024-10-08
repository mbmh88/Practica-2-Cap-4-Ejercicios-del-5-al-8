package TiendaMascotas;

public class Gato extends Mascota{
    private double alturaSalto;
    private double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(double longitudSalto) {
        this.longitudSalto = longitudSalto;
    }
    public static void sonido(){
        System.out.println("Los gatos maullan y ronronean");
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Altura de salto"+alturaSalto+" metros");
        System.out.println("Longitud de salto: "+longitudSalto+" metros");
    }
}
