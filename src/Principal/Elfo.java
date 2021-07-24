package Principal;

public class Elfo extends Datos{
    @Override
    public void Nombres() {
        System.out.println("---------------------------------------------------------");
        System.out.println("El nombre de tu personaje es: ");
        System.out.println(" *** Rodrigo el elfo *** ");
    }

    @Override
    public void Vidas() {
        System.out.println("¡¡¡Su vida esta al maximo!!!");
    }

    @Override
    public void VidasModificadas() {
        System.out.println("La vida de este personaje puede modificarse cuando desee.");
        System.out.println("---------------------------------------------------------");
    }
}
