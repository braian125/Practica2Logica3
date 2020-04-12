package avl;

/**
 *
 * @author Alejandro
 * @param <T>
 */
public class NodoBinarioBusqueda<T extends Comparable> extends NodoBinarioGenerico<T> {

    public NodoBinarioBusqueda(T dato, String s) {
        super(dato, s);
    }

    @Override
    public T getDato() {
        return dato;
    } 
}