
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
        emple.imprimirEmpleados();
        emple.calcularNomina();
        emple.calcularPrestaciones();

    }   
}