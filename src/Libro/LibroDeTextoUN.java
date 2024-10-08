package Libro;

public class LibroDeTextoUN extends LibroDeTexto{
    private String facultad;

    public LibroDeTextoUN(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public void vizualizar(){
        super.visualizar();
        System.out.println("Facultad que lo publico: "+facultad);
    }
}
