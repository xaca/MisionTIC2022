//package Clases;

//El Bot no lee el package toca borrarlo.

public class Empleado {
    
    private int id;
    private String nombre;
    private int horasExtra;
    private boolean auxilioTransporte;
    private int salario;
    
    public Empleado(){
        
    }
    //Contructor con paramatros.
    public Empleado(String nombre, int horasExtra, boolean auxilioTransporte, int salario) {
        //this.id = id;
        this.nombre = nombre;
        this.horasExtra = horasExtra;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
    }
    
    //Metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public boolean isAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(boolean auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    //Retornar String
    
     @Override
    //metodo parasobre escribir el metodo ToString para poder mostrarlo por pantalla

    public String toString(){
  
        return getNombre() +","+ getHorasExtra() +","+ isAuxilioTransporte() +","+ getSalario();
    }
    
}