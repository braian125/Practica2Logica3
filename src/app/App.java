package app;

import narytree.Narytree;

public class App {
    public static void main(String[] args) throws Exception {
        
        Narytree tree = new Narytree();
        System.out.println("1 " + tree.getRoot().getInfo().getName());
        tree.displayTree(tree.getRoot().getChildren(), tree.getRoot().getInfo());
    }
}