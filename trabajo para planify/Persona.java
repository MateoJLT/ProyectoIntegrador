package trabajo para planify;

public class Persona {
    private String nombre;
    private int edad;
    private String cedula;
    private String actividades;
    private String estadoCivil;
    private int presupuesto;
    private int telefono;
    private String correoElectronico;
    private String direccion;

    // Constructor
    public Persona(String nombre, int edad, String cedula, String actividades, String estadoCivil, int presopuesto, int telefono, String correoElectronico, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.actividades = actividades;
        this.estadoCivil = estadoCivil;
        this.presupuesto = presupuesto;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    // Metodo para mostrar la informacion de la persona

    public void mostrarInformacion() {
        System.out.println("Nombre completo : " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
        System.out.println("Actividades: " + actividades);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo Electronico: " + correoElectronico);
        System.out.println("Direccion: " + direccion);
    }
}
