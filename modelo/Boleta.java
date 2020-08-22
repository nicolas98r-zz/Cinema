package modelo;

public class Boleta {
    private String horaFuncion;
    private int precio;
    private Sala sala;
    private Silla silla;
    
    public Boleta(String horaFuncion, Sala sala, int numeroSilla){
        this.horaFuncion = horaFuncion;
        this.sala = sala;
        this.silla = sala.getSillas()[numeroSilla];
        this.precio = this.silla.getPrecio();
    }

    public String getHoraFuncion() {
        return horaFuncion;
    }

    public int getPrecio() {
        return precio;
    }

    public Silla getSilla() {
        return silla;
    }
}
