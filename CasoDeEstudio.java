public class Funcionario extends Persona {
  //ATRIBUTO
    private String puesto;
  // CONSTRUCTOR
    public Funcionario(String nombre, String email, String cedula, String puesto) {
        super(nombre, email, cedula);
        this.puesto = puesto;
    }
  // GETTER Y SETTER
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    // METODOS
    public void enviarRecordatorio(Recordatorio recordatorio) {
        System.out.println("Recordatorio enviado: " + recordatorio.getIdRecordatorio());
    }
    public Instancia crearInstancia(String tipo, String comentario, Estudiante estudiante) {
        Instancia nueva = new Instancia(tipo, comentario, estudiante);
        System.out.println("Instancia creada para el estudiante: " + estudiante.getNombreCompleto());
        return nueva;
    }
    public Incidencia generarIncidencia(String descripcion, Estudiante estudiante) {
        Incidencia incidencia = new Incidencia(descripcion, estudiante, this.getNombre());
        System.out.println("Incidencia registrada: " + descripcion);
        return incidencia;
    }
    public void generarInforme(Estudiante estudiante) {
        System.out.println("Generando informe para el estudiante: " + estudiante.getNombreCompleto());
    }
    public Instancia clonarInstancia(Instancia original) {
        Instancia clon = new Instancia(
                original.getTipo(),
                "Clon de: " + original.getComentariosConfidenciales(),
                original.getEstudiante()
        );
        System.out.println("Instancia clonada con éxito.");
        return clon;
    }
}