package package1;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    // Constructor
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    // Método Getter para el nombre (necesario para buscar y eliminar)
    public String getNombre() {
        return nombre;
    }

    // Método para imprimir el contacto de forma legible
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Tel: " + telefono + " | Email: " + email;
    }
}