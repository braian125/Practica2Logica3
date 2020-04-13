package app;

import java.util.Scanner;
import narytree.Narytree;
import narytree.Person;


/**
 * Descripcion de clase principal
 * 
 * El menu que encontramos en esta clase permite: el ingreso de una nueva persona o nodo,
 * Buscar una perona o nodo ya ingresado anterior mente, y
 * mostrara todas las personas, indicando cuales son los padre e hijos
 * 
 * @author: Brian Vanegas
 * @author: Emiro Moreno
*/

public class App {
    public static void main(String[] args) throws Exception {
        int opcion=0;
        String id, name, parentId;
        Narytree tree = new Narytree();       
        Scanner teclado = new Scanner(System.in);
        
        do {
            opcion = menu();

            switch (opcion) {
                case '1':
                    System.out.println("Ingrese la identificacion de la persona");
                    id = teclado.nextLine();
                    System.out.println("Ingrese el nombre de la persona");
                    name = teclado.nextLine();

                    System.out.println("Escriba el ID del padre, si no tiene escriba 0");
                    parentId = teclado.nextLine();

                    if (parentId == "0") {
                        tree.insertNode(new Person(id, name));
                    } else {
                        tree.insertNode(new Person(id, name), parentId);
                    }

                    tree.displayTree(tree.getRoot().getChildren(), tree.getRoot().getInfo());
                    
                    break;

                case '2':
                    break;

                case '3':
                    System.out.println("Los archivos cargado son:");  
                    System.out.println("1 " + tree.getRoot().getInfo().getName());
                    tree.displayTree(tree.getRoot().getChildren(), tree.getRoot().getInfo());
                    break;
            }
        } while (opcion != '4');

    }

    
    public static char menu() {
        char opc;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Insertar nueva persona");
            System.out.println("2. Buscar una persona");
            System.out.println("3. Mostrar árbol");
            System.out.println("4. Salir");
            
            Scanner teclado = new Scanner(System.in);
            opc = teclado.next().charAt(0);

        } while (opc < '1' || opc > '4');
        return opc;
    }
    
    }
