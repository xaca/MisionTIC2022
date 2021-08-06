//import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        //por qué usamos una lista porque manejar 10 variables se hace innmanegable
        //otra forma de crear una lista "Enlazada",estas son más dinamicas. 
        LinkedList<Integer> linked_list_digits = new LinkedList<Integer>(); //se crea una  lista enlazada vacia de enteros
        ////se crea un array list vacia de enteros
        ArrayList<Integer> array_list_digitos = new ArrayList<Integer>();
        //Digitados (números enteros del 09, en total 10 posiciones) 0,1,2,3,4,5,6,7,8,9
        //Arreglo de tipo entero. (esta es herada de C++)
        int arreglo_digitos[] = new int[10];
        //llenar las 3 listas.
        for (int i=0;i<10;i++){
            linked_list_digits.add(i);
            array_list_digitos.add(i);
            arreglo_digitos[i] = i; //similar a numpy en pyhton. 
        }
        //imprimir los 3 arreglos.
        //para cada elemento de una lista haga:
        System.out.println("Metodo con Linked List");
        for (int digits : linked_list_digits){
            System.out.println("Digitos"+digits);
        }
        System.out.println("Metodo con Array List");
        for (int p=0;p<array_list_digitos.size();p++){
            //usamos un metodo get para traer lo que hay en la posición. Es decir p para indicar la posición y p el contenido
            System.out.println("array_list_digitos["+p+"]="+array_list_digitos.get(p));
        }
        System.out.println("Metodo con clasico");
        for (int pos=0;pos<10;pos++){
            System.out.println("array_list_digitos["+pos+"]="+arreglo_digitos[pos]+"");
        }
        
    }
}
