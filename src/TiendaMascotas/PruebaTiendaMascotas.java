package TiendaMascotas;

public class PruebaTiendaMascotas{
    public static void main(String[] args){
        Perro pastorAleman = new PerroGrande.PastorAleman("Rex",5,"NEGRO",40.0,true);
        pastorAleman.mostrarInfo();
        Perro.sonido();
        Gato esfinge = new GatoSinPelo.Esfinge("Sphinx",3,"Gris",1.5,2.0);
        esfinge.mostrarInfo();
        Gato.sonido();
    }
}
