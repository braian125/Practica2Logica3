package app;

import avl.ArbolAVL;
import avltree.Palabra;
import narytree.Narytree;

public class App {
    public static void main(String[] args) throws Exception {
        
        Narytree tree = new Narytree();
        System.out.println("1 " + tree.getRoot().getInfo().getName());
        tree.displayTree(tree.getRoot().getChildren(), tree.getRoot().getInfo());

        /* ArbolAVL arbolAVL = new ArbolAVL();
        arbolAVL.insertarDato('a');
        arbolAVL.insertarDato('b');

        System.out.println(arbolAVL.buscar('a')); */

        //System.out.println( "Buscar = " + arbolAVL.buscar("palabra") );
    }
}