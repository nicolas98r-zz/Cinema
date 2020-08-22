package modelo;

public class Cliente {
    private String nombre, cedula;
    private int puntosAcumulados;
    
    public Cliente(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
        this.puntosAcumulados = 0;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    
}
