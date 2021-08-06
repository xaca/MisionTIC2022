    /**
     * PruebaNomica
     */

    import java.util.*;
    public class PruebaNomica {
    
        public static void main(String[] args) {

            ArrayList<Double> nomina_f =  new ArrayList<Double>();
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
                cesantias = totalDevengado + 0.0833;
                intereses_cesantias = cesantias + 0.12;
                prima_ser = totalDevengado + 0.0833;
                prestaciones = vacaciones + cesantias + intereses_cesantias + prima_ser;
                nomina_f.add(prestaciones);
        }
    }