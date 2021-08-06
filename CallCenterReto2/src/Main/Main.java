
package Main;

/**
 *
 * @author Julian
 */

import java.util.ArrayList;
import java.util.Scanner;
import Clases.*;//import all class of package "Clases"

public class Main {
    
    public static void main (String[] args) {
       
        //Instanciamos el objeto de clases.
        CallCenter emple = new CallCenter();
        ArrayList<Empleado> employe = new ArrayList<>();
        employe.add(new Empleado("Carmen",40000,true,1500000));
        employe.add(new Empleado("Laura",50000,false,2000000));
        emple.setEmpleados(employe);
        
        System.out.println("Empleados: ");
        for (int i = 0;i < employe.size();i++){
                      System.out.println(" Empleado: "+ employe.get(i));
            }
        System.out.println("Total Nomina: ");
        ArrayList<Double> nomina = new ArrayList<Double>();
        nomina=emple.liquidarNominaEmp(employe);
        for (int i = 0;i < nomina.size();i++){
            System.out.println(" Empleado: " + Math.round(nomina.get(i)));
        }
        System.out.println("Prestaciones");
        ArrayList<Double> nomina2 = new ArrayList<Double>();
        nomina2=emple.liquidarPrestacionesEmp(employe);
        for (int i = 0;i < nomina2.size();i++){
            System.out.println(" Empleado: " + Math.round(nomina2.get(i)));
        }
    }   
}