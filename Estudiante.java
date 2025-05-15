public class Estudiante extends Persona {

    private String fechaNacimiento;
    private String foto;
    private String grupo;
    private String carrera;
    private String sistemaSalud;
    private String motivoDerivacion;
    private String infoSalud;
    private String comentarios;
    private String obsConfidenciales;

    public Estudiante() {
        super();
    }

    public Estudiante(String nombre, String cedula, String direccion, String telefono, String email,
                      String fechaNacimiento, String foto, String grupo, String carrera,
                      String sistemaSalud, String motivoDerivacion, String infoSalud,
                      String comentarios, String obsConfidenciales) {
        super(nombre, cedula, direccion, telefono, email);
        this.fechaNacimiento = fechaNacimiento;
        this.foto = foto;
        this.grupo = grupo;
        this.carrera = carrera;
        this.sistemaSalud = sistemaSalud;
        this.motivoDerivacion = motivoDerivacion;
        this.infoSalud = infoSalud;
        this.comentarios = comentarios;
        this.obsConfidenciales = obsConfidenciales;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getMotivoDerivacion() {
        return motivoDerivacion;
    }

    public void setMotivoDerivacion(String motivoDerivacion) {
        this.motivoDerivacion = motivoDerivacion;
    }

    public String getInfoSalud() {
        return infoSalud;
    }

    public void setInfoSalud(String infoSalud) {
        this.infoSalud = infoSalud;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getObsConfidenciales() {
        return obsConfidenciales;
    }

    public void setObsConfidenciales(String obsConfidenciales) {
        this.obsConfidenciales = obsConfidenciales;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Fecha de nacimiento: " + fechaNacimiento + "\n" +
                "Foto: " + foto + "\n" +
                "Grupo: " + grupo + "\n" +
                "Carrera: " + carrera + "\n" +
                "Sistema de salud: " + sistemaSalud + "\n" +
                "Motivo de derivación: " + motivoDerivacion + "\n" +
                "Información de salud: " + infoSalud + "\n" +
                "Comentarios: " + comentarios + "\n" +
                "Observaciones confidenciales: " + obsConfidenciales;
    }

}
