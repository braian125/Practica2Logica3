package avl;

/**
*
* @author Alejandro
* @param <T>
*/
public class NodoBinarioGenerico<T> {

   protected final T dato;
   private String significado;
   private NodoBinarioGenerico<T> li;
   private NodoBinarioGenerico<T> ld;

   public NodoBinarioGenerico(T dato, String s) {
       this.dato = dato;
       this.significado = s;
   }

   public T getDato() {
       return dato;
   }

   public NodoBinarioGenerico<T> getLi() {
       return li;
   }

   public void setLi(NodoBinarioGenerico<T> li) {
       this.li = li;
   }

   public NodoBinarioGenerico<T> getLd() {
       return ld;
   }

   public void setLd(NodoBinarioGenerico<T> ld) {
       this.ld = ld;
   }

   public String getSignificado() {
       return this.significado;
   }

    /**
    * @param significado the significado to set
    */
   public void setSignificado(String significado) {
       this.significado = significado;
   }

   @Override
   public String toString() {
       return dato.toString();
   }

}