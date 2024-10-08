package Libro;

public class PruebaLibros {
    public static void main(String[] args){
        Libro libro1 = new Libro("Cien años de soledad","Gabriel Garcia Marquez",150.0);
        libro1.visualizar();

        LibroDeTexto libroDeTexto = new LibroDeTexto("Matematicas basicas","Jhon Doe",200.0,"Matematicas");
        libroDeTexto.visualizar();

        LibroDeTextoUN libroDeTextoUN = new LibroDeTextoUN("Ingenieria avanzada","Jane Doe",300.0,"Ingenieria","Facultad de ingenieria");
        libroDeTextoUN.vizualizar();

        Novela novela = new Novela("1984","George Orwell",180.0,"Ciencia ficcion");
        novela.visualizar();
    }

}
