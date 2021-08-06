//package Clases;

import java.util.ArrayList;

public class CallCenter {
    
    //Atributos
    Empleado employe;
    private ArrayList<Empleado> empleados = new ArrayList<>();    
    
    public CallCenter(){

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

    //Otros Metodos
   
    public static ArrayList<Double> liquidarNominaEmp(ArrayList<Empleado> empleados){
       
        var nomina = new ArrayList<Double>();
        if (empleados == null) {
            return null;
        }else{
            for(int i = 0; i < empleados.size(); i++){
                double totalDevengado = empleados.get(i).getSalario() + empleados.get(i).getHorasExtra();
                double salud_Pension = totalDevengado * 0.08;
                double aux_Transporte = 106454;
                double salarioTotalDeducciones;
                if(empleados.get(i).isAuxilioTransporte() == true){
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
    
    public static  ArrayList<Double> liquidarPrestacionesEmp(ArrayList<Empleado> empleados){
        
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
            if(empleados.get(i).isAuxilioTransporte() == true){
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