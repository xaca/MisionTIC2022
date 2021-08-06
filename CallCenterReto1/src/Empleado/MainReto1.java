package Empleado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class MainReto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Como vamos a pasar varios atributoss vamos a crear un objeto de tipo arreglo
        //Es decir el arreglo va a contener los atributos de la clase Empleado por eso creamos un arreglo tipo empleado
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        //Scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);
        //Declaramos variables que reciban los atributos.
        int horasExtra;
        int salario;
        int num_emp;
        String nombre;
        boolean auxilioTransporte;
        //Esta variable es auxiliar que va a comparar la opción de "Si" o "No"
        //String auxilar;
        //creamos una condición para validar la cantidad de empleados a digitar y que el numero no sea 0
        do{
            System.out.println("Digite el número de empleados a ingresar: ");
            num_emp = entrada.nextInt();
        }while(num_emp<0);
        //creamos un for para que recorra y agregue los datos al arreglo de tipo empleados la cantidad de empleados a digitar.
        for(int i = 1;i<=num_emp;i++){
            System.out.println("Empleado número: " + i);
            System.out.print("Digite el nombre del empleado: ");
            nombre = entrada.next();
            System.out.print("Digite el valor de las Horas Extra: ");
            horasExtra = entrada.nextInt();
            System.out.print("Digite el Salario del empleado: ");
            salario = entrada.nextInt();
            //Este if es para validar si el salario es mayo a 2 salarios minimo. Si es menor  que convierta y agregue la variable auxiliar en true.
            if (salario <= 1817052){
                auxilioTransporte = true;
            }
            else{
                auxilioTransporte = false;
            }
            //para no crear multiples objetos
            Empleado employe = new Empleado(nombre,horasExtra,auxilioTransporte,salario);        
            //se añade el objeto al final del array usando el .add
            empleados.add(employe);
            //Esta condición es para validar que el usuasrio digite si o no. Pero no se considera utill.
            
            /*System.out.print("Digite 'Si' o 'No' si tiene Auxilio de transporte: ");
            auxilar = entrada.next().toLowerCase();
            if (auxilar.equals("si")){
                System.out.println("Llego hasta el si");
                auxilioTransporte = true;
            }
            else{
                auxilioTransporte = false;
            }*/
        }
        /*empleados.add(new Empleado("Carmen",40000,true,1500000));
        empleados.add(new Empleado("Pablo",25000,true,1200000));
        empleados.add(new Empleado("Laura",50000,false,2000000));*/
        //For para mostrar la nomina de los empleados digitados.
        for (int i = 0;i < empleados.size();i++){
            System.out.println(" Empleado: "+ empleados.get(i));
        }
        
        //creamos una variable que va a recibir el tocal devengado y la pasamos por un for para mostrar
        //la declaramos como variable double para que muestre el valor.
        System.out.println("Total nómina");
        ArrayList<Double> nomina = new ArrayList<Double>();
        nomina=Empleado.liquidarNominaEmp(empleados);
        for (int i = 0;i < nomina.size();i++){
            System.out.println(" Empleado: " + Math.round(nomina.get(i)));
        }
        entrada.close();
    }   
    
}
