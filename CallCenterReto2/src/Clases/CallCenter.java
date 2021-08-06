//package Clases;

import java.util.ArrayList;

public class CallCenter {
    
    //Atributos
    private Empleado employe;
    private ArrayList<Empleado> empleados;    
    
    public CallCenter(){
        empleados = new ArrayList<Empleado>();
    } 
    public CallCenter(Empleado employe){
        empleados = new ArrayList<Empleado>();
        this.employe = employe;
    }    

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void imprimirEmpleados(){
        System.out.println("Empleados: ");
        for (int i = 0;i < empleados.size();i++){
                  System.out.println(" Empleado: "+ empleados.get(i));
        }
    }

    public void calcularNomina(){
        System.out.println("Total Nomina: ");
        ArrayList<Double> nomina = liquidarNominaEmp();
        for (int i = 0;i < nomina.size();i++){
            System.out.println(" Empleado: " + Math.round(nomina.get(i)));
        }
    }

    public void calcularPrestaciones(){
        System.out.println("Prestaciones");
        ArrayList<Double> nomina2 = liquidarPrestacionesEmp();
        for (int i = 0;i < nomina2.size();i++){
            System.out.println(" Empleado: " + Math.round(nomina2.get(i)));
        }
    }

    //Otros Metodos
   
    public ArrayList<Double> liquidarNominaEmp(){
       
        double totalDevengado;
        double salud_Pension;
        double aux_Transporte;
        double salarioTotalDeducciones;
        var nomina = new ArrayList<Double>();

        if (empleados == null) {
            return null;
        }else{
            for(int i = 0; i < empleados.size(); i++){
                totalDevengado = empleados.get(i).getSalario() + empleados.get(i).getHorasExtra();
                salud_Pension = totalDevengado * 0.08;
                aux_Transporte = 106454;
                salarioTotalDeducciones;

                if(empleados.get(i).isAuxilioTransporte()){
                    salarioTotalDeducciones = totalDevengado - salud_Pension + aux_Transporte;
                    nomina.add(salarioTotalDeducciones);
                }
                else{
                    salarioTotalDeducciones = totalDevengado-salud_Pension;
                    nomina.add(salarioTotalDeducciones);
                }
            }
            return nomina;
        }
    }   
    
    public void  ArrayList<Double> liquidarPrestacionesEmp(){
        
        var nomina_f =  new ArrayList<Double>();
        double prestaciones;
        double totalDevengado;
        double vacaciones;
        double aux_Transporte = 106454;
        double cesantias;
        double intereses_cesantias;
        double prima_ser;
        //TotalDevengado = Salario + Horas Extra
        // Vacaciones =  Salario + 4.16 %
        // Cesantias = Total Devengado + 8.33 %
        // Intereses de cesantias = Valor de las cesantias + 12 %
        // Prima de servicios = TotalDevengado + 8.33%

        for (int i = 0;i < empleados.size();i++){
            vacaciones =  empleados.get(i).getSalario() * 0.0416;

            if(empleados.get(i).isAuxilioTransporte())
            {
                totalDevengado = empleados.get(i).getSalario() + empleados.get(i).getHorasExtra()+aux_Transporte;
            }
            else{
                totalDevengado = empleados.get(i).getSalario() + empleados.get(i).getHorasExtra();
            }
            cesantias = totalDevengado * 0.0833;
            intereses_cesantias = cesantias * 0.12;
            prima_ser = totalDevengado * 0.0833;
            prestaciones = vacaciones + cesantias + intereses_cesantias + prima_ser;
            nomina_f.add(prestaciones);
        }
        return nomina_f;
    }
}