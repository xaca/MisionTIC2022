package Empleado;

import java.util.ArrayList;

public class Empleado {
    
    private int id;
    private String nombre;
    private int horasExtra;
    private boolean auxilioTransporte;
    private int salario;
    
    //Constructor.
    //sin el int id (Ya que con el bot no funciona)
    public Empleado(String nombre, int horasExtra, boolean auxilioTransporte, int salario){
        //this.id = id;
        this.nombre = nombre;
        this.horasExtra = horasExtra;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
    }
    
    public static ArrayList<Double> liquidarNominaEmp(ArrayList<Empleado> empleados){
        
        //Creamos una nueva lista que retorne el total devengado
        ArrayList<Double> nomina = new ArrayList<Double>();
        if (empleados == null) {
            return null;
        }else{
            for(int i = 0; i < empleados.size(); i++){
                double sueldo_base = empleados.get(i).salario + empleados.get(i).horasExtra;;
                double sueldo_out = sueldo_base * 0.08;
                double aux_Transporte = 106454;
                double sueldo_total = 0;
                if(empleados.get(i).auxilioTransporte == true){
                    sueldo_total = sueldo_base - sueldo_out+aux_Transporte;
                    nomina.add(sueldo_total);
                }
                else{
                    sueldo_total = sueldo_base-sueldo_out;
                    nomina.add(sueldo_total);
                }
            }
            return nomina;
        }
    }
     @Override
    //metodo para convertir el arreglo en ToString
    public String toString(){
        return id + "," + nombre +","+ horasExtra +","+ auxilioTransporte +","+salario;
    }
}
