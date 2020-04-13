package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;
import avl.ArbolAVL;
import avl.NodoAVL;

/**
 * clase Diccionario
 * 
 * @author: Brian Vanegas
 * @author: Emiro Moreno
*/
public class Diccionario extends ArbolAVL {

    private int cantidad;
    private final JTextArea jTextAreaResultado;

    Diccionario(JTextArea jTextAreaResultado) throws IOException, Exception {
        this.cantidad = 0;
        this.jTextAreaResultado = jTextAreaResultado;
        populatevocabulary();
    }

    public void insertar(Comparable dato, String s) throws Exception {
        if (super.buscar(dato) == null) {
            if( super.insertarDato(dato, s) == null) {
                throw new Exception("Error al insertar la palabra " + dato);
            }
            cantidad++;
            //jTextAreaResultado.setText((String) dato);
        }
    }

    public void buscar(String dato) {
        NodoAVL nodo = super.buscar(dato);
        if ( nodo == null) {
            jTextAreaResultado.setText(" La palabra " + dato + " No se encuentra");
        } else {
            jTextAreaResultado.setText("");
            jTextAreaResultado.setText(nodo.getSignificado());
        }
    }

    public void modificar(String dato, String s) {
        NodoAVL nodo = super.modificar(dato, s);
        System.out.println(nodo.getSignificado());
    }

    public int getCantidad() {
        return cantidad;
    }

    public final void populatevocabulary() throws FileNotFoundException, IOException, Exception {
        BufferedReader in = new BufferedReader(new FileReader("words.dic"));
        String linea;
        String palabra;
        String descripcion;
        while ((linea = in.readLine()) != null) {
            palabra = (linea.split("\\ ===> "))[0];
            descripcion = (linea.split("\\ ===> "))[1];
            insertar(palabra, descripcion);
        }
    }

}