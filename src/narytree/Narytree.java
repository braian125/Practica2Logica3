package narytree;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Descripcion de la Clase Narytree y sus metodos
 * 
 * la clase podra manipular un arbol Nario gracias a los siguientes metodos:
 * getLevel dira el nivel que tiene el arbol,
 * findparentNote el cual encontrara el nodo principaldel arbol,
 * displayTree es simplemente mostrar, mostrara los dato, indicando cuales son los padre e hijos
 * loadFile te leera el archito tipo txt donde guardamos los datos
 * 
 * 
 * @author: Brian Vanegas
 * @author: Emiro Moreno
*/


public class Narytree {

    private Node root;
    
    public Narytree() {
      root = new Node(new Person("0", "DIOS"));
      this.loadFile();
    }

    public int getLevel(ArrayList<Node> children, String id) {
        int level = 1;
        for(int i=0; i < children.size(); i++) {
            if (!id.equals(children.get(i).getInfo().getId())) {
                if (children.get(i).getChildren().size() > 0) {
                    level = level + 1;
                    getLevel(children.get(i).getChildren(), id);
                }
            }
        }
        return level;
    }

    public Node findParentNode(ArrayList<Node> children, String id) {
        Node node = null;
        for (int i = 0; i < children.size(); i++) {
			if (id.equals(children.get(i).getInfo().getId())) {
                node = children.get(i);
            } else {
                findParentNode(children.get(i).getChildren(), id);
            }
        }
        
        return node;
    }

    public void insertNode(Person person) {
        this.getRoot().addChild(new Node(person));
    }

    public void insertNode(Person person, String parentId) {
        Node parent = this.findParentNode(this.getRoot().getChildren(), parentId);
        if (parent == null) {
            insertNode(person);
        } else {
            parent.addChild(new Node(person));
        }
    }

    public void displayTree(ArrayList<Node> children, Person parent) {
        for (int i = 0; i < children.size(); i++) {
            System.out.println("Padre "+ parent.getName() + " " + children.get(i).getInfo().getName());
            if (!children.get(i).getChildren().isEmpty()) {
                displayTree(children.get(i).getChildren(), children.get(i).getInfo());
            }
        }
    }

    /**
     * Retorna la raiz del arbol N-ario
     * @return Tipo de dato Nodo
     */
    public Node getRoot() {
        return root;
    }

    public void loadFile() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("data.txt"))) {

            String line;
            Node parent;
            while ((line = br.readLine()) != null) {
                String[] persons = line.split("\\,");
              
                for (int i = 0; i < persons.length; i++) {
                    String id = persons[i].split("\\ ")[0];
                    String name = persons[i].split("\\ ")[1];

                    parent = this.findParentNode(this.getRoot().getChildren(), persons[0].split("\\ ")[0]);
                    if (i == 0) {
                        if (parent == null) {
                            this.getRoot().addChild(new Node(new Person(id, name)));
                        }
                    } else {
                        parent.addChild(new Node(new Person(id, name)));
                    }
                }

                System.out.println("Archivo cargado correctamente!!");
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        //System.out.println(sb);
    }
    
  
}