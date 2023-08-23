public class Diputado {
    private String nombre;
    private String nombrePartido;
    private int idDiputado;




    public Diputado(String nombre, int idDiputado, String nombrePartido){
        this.nombre = nombre;
        this.nombrePartido = nombrePartido;
        this.idDiputado = idDiputado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public int getIdDiputado() {
        return idDiputado;
    }

    public void setIdDiputado(int idDiputado) {
        this.idDiputado = idDiputado;
    }




    @Override
    public String toString() {
        return "Diputado{" +
                "nombre='" + nombre + '\'' +
                ", nombrePartido='" + nombrePartido + '\'' +
                ", idDiputado=" + idDiputado +
                '}';
    }
}
