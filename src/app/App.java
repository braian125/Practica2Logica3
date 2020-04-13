package app;

import java.util.Scanner;
import narytree.Narytree;


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
        String id,nom;
        Narytree tree = new Narytree();       
        Scanner teclado = new Scanner(System.in);
        
 do {
            opcion = menu();

            switch (opcion) {
              
                case '1':
                    
 
                   
                    break;

                case '2':
                       
                          

                    break;

                case '3':
                          System.out.println("Los archivos cargado son:");  
                          System.out.println("1 " + tree.getRoot().getInfo().getName());
                          tree.displayTree(tree.getRoot().getChildren(), tree.getRoot().getInfo());

                   

                    break;

                
               
            }

        } while (opcion != '6');

    }

    
    public static char menu() {
        char opc;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Insertar una nueva Persona");
            System.out.println("2. Buscar una persona ");
            System.out.println("3. Cargar datos desde un archivo");         
            System.out.println("4. Salir");
            
            Scanner teclado = new Scanner(System.in);
            opc = teclado.next().charAt(0);

        } while (opc < '1' || opc > '4');
        return opc;
    }
    
    }
