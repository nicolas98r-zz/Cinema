package modelo;

public class Pelicula {
    private String horario, genero, nombre, calificacion;

    public Pelicula(String horario, String genero, String nombre, String calificacion){        
        this.horario = horario;
        this.genero = genero;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }
    
    
}
