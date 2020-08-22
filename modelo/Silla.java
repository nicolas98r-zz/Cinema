package modelo;

public class Silla {

    private String categoria, estado;
    private int precio, numero;

    public Silla(String categoria, int precio, int numero) {
        this.categoria = categoria;
        this.precio = precio;
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
