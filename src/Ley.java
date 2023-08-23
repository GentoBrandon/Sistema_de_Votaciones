import java.util.Date;

public class Ley {
    private String nombre;
    private String numeroLey;
    private Date fechaVotacion;

    public Ley(String nombre, String numeroLey, Date fechaVotacion){
        this.nombre =  nombre;
        this.numeroLey = numeroLey;
        this.fechaVotacion = fechaVotacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroLey() {
        return numeroLey;
    }

    public void setNumeroLey(String numeroLey) {
        this.numeroLey = numeroLey;
    }

    public Date getFechaVotacion() {
        return fechaVotacion;
    }

    public void setFechaVotacion(Date fechaVotacion) {
        this.fechaVotacion = fechaVotacion;
    }

    @Override
    public String toString() {
        return "Ley{" +
                "nombre='" + nombre + '\'' +
                ", numeroLey=" + numeroLey +
                ", fechaVotacion=" + fechaVotacion +
                '}';
    }
}
