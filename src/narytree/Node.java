package narytree;

import java.util.ArrayList;

/**
 * Clase Node
 * 
 * @author: Brian Vanegas
 * @author: Emiro Moreno
*/

public class Node {
    private int sw;
    private Person info;
    private Node liga;
    private Node lDato;
    ArrayList<Node> children;
    

    /**
     * Crea un nodo para un arbol n-ario 
     * @param info Recibe el info del nodo
     */
    public Node(Person info) {
        this.sw = 0;
        this.info = info;
        children = new ArrayList<>();
    }

    
    /**
     * Devuelve 0 si el campo de info contiene un char
     * Devuelve 1 si el campo de info tiene hijos/subarbol
     * @return tipo de info int
     */
    public int getSw() {
        return sw;
    }

    /**
     * Permite asignar 0 si el campo de info contiene un char
     * Permite asignar 1 si el campo de info tiene hijos/subarbol
     * @param sw Recibe un tipo de info byte 0 o 1
     */
    public void setSw(int sw) {
        this.sw = sw;
    }

    /**
     * Devuelve el info que está almacenado en el nodo
     * @return tipo de info Char
     */
    public Person getInfo() {
        return info;
    }

    /**
     * Permite asignar/modificar el info del nodo
     * @param info Recibe el átomo de la hilera
     */
    public void setInfo(Person info) {
        this.info = info;
    }

    /**
     * Devuelve la liga del nodo
     * @return tio de info Nodo
     */
    public Node getLiga() {
        return liga;
    }

    /**
     * Modifica y asigna la liga del nodo
     * @param liga Recibe 
     */
    public void setLiga(Node liga) {
        this.liga = liga;
    }

    public Node getlDato() {
        return lDato;
    }

    public void setlDato(Node lDato) {
        this.lDato = lDato;
    }

    public ArrayList getChildren() {
        return this.children;
    }

    public void addChild(Node node) {
        this.children.add(node);
    }
}