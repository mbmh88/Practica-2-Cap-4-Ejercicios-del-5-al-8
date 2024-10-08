package TiendaMascotas;

public class Mascota {
    private String nombre;
    private int edad;
    private String color;

    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad"+edad+" años");
        System.out.println("Color: "+color);
    }
}
