package Libro;

public class Novela extends  Libro{
    private String genero;

    public Novela(String titulo, String autor, double precio, String genero) {
        super(titulo, autor, precio);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void vizualisar(){
        super.visualizar();
        System.out.println("Genero: "+genero);
    }
}
