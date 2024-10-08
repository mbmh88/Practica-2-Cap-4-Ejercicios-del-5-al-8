package Libro;

public class LibroDeTexto extends Libro{
    private String curso;

    public LibroDeTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public  void visualizar(){
        super.visualizar();
        System.out.println("Curso asociado: "+curso);
    }
}
