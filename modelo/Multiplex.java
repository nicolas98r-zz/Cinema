package modelo;

import java.util.ArrayList;

public class Multiplex {
    private int cantidadSalas, calificacion;    
    private final String nombre;
    private ArrayList<Empleado> empleados;
    
    public Multiplex(String nombre,int cantidadSalas){
        this.empleados = new ArrayList<>();
        this.nombre = nombre;
        this.cantidadSalas = cantidadSalas;        
        this.calificacion = 0;
    }

    public void setListaEmpleados(ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
        
    public void agregarEmpleado(Empleado nuevoEmpleado){
        this.empleados.add(nuevoEmpleado);
    }
    
    public void eliminarEmpleado(Empleado nuevoEmpleado){
        this.empleados.remove(nuevoEmpleado);
    }

    public int getCantidadSalas() {
        return cantidadSalas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantidadSalas(int cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
            
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
