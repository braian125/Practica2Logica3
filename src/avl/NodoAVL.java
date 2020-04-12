package avl;

public class NodoAVL<T extends Comparable> extends NodoBinarioBusqueda {
    
    private int fB;

    public NodoAVL(T dato, String s) {
        super(dato, s);
    }
    
    public int getfB() {
        return fB;
    }

    public void setfB(int fB) {
        this.fB = fB;
    }

    
}