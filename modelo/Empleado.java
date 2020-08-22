package modelo;

public class Empleado {
    
    private String codigo, cedula, nombre, numeroTelefono;    
    private int salario;
    private Multiplex multiplexAsignado;
    private Contrato contrato;
    public Empleado(String codigo, String cedula, String nombre, String numeroTelefono, int salario, Contrato contrato, Multiplex multiplexAsignado){
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;        
        this.contrato = contrato;
        this.multiplexAsignado = multiplexAsignado;
        this.salario=this.contrato.getSueldoInicial();
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setMultiplexAsignado(Multiplex multiplexAsignado) {
        this.multiplexAsignado = multiplexAsignado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public Multiplex getMultiplexAsignado() {
        return multiplexAsignado;
    }
    
    public Contrato getContrato() {
        return contrato;
    }
}
