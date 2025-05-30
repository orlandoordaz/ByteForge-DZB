public class Persona {

    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String email;

    public Persona() {}

    public Persona(String nombre, String cedula, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre; }

    public String getCedula() {
        return cedula; }
    public void setCedula(String cedula) {
        this.cedula = cedula; }

    public String getDireccion() {
        return direccion; }
    public void setDireccion(String direccion) {
        this.direccion = direccion; }

    public String getTelefono() {
        return telefono; }
    public void setTelefono(String telefono) {
        this.telefono = telefono; }

    public String getEmail() {
        return email; }
    public void setEmail(String email) {
        this.email = email; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Cédula: " + cedula + "\n" +
                "Dirección: " + direccion + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Email: " + email;
    }

}
