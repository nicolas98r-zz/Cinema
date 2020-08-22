package modelo;
import java.util.Calendar;

public class Contrato {
    
    private String fechaInicio, cargo, id;
    private int sueldoInicial;
    public Contrato(int sueldoInicial, String cargo, String id){
        this.sueldoInicial = sueldoInicial;
        this.cargo = cargo;
        this.id = id;
        Calendar calendario = Calendar.getInstance();
        String dia = Integer.toString(calendario.get(Calendar.DATE));
        String mes = Integer.toString(calendario.get(Calendar.MONTH));
        String ano = Integer.toString(calendario.get(Calendar.YEAR));
        this.fechaInicio = dia+"/"+mes+"/"+ano;
    }

    public int getSueldoInicial() {
        return sueldoInicial;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
