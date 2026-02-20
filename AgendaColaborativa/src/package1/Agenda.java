package package1;

import java.util.ArrayList;
import java.util.List;

import controlador.Contacto;

public class Agenda {
	 private List<Contacto> listaContactos;

	    public Agenda() {
	        this.listaContactos = new ArrayList<>();
	    }
	public void agregarContacto(Contacto c) {}
	
	public void eliminarContacto(String nombre) {
        Contacto c = buscarContacto(nombre);
        if (c != null) { 
            listaContactos.remove(c);
            System.out.println("Contacto '" + nombre + "' eliminado correctamente.");
        } 
        else {
            System.out.println("el contacto '" + nombre + "' no existe.");
        }
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto c : listaContactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

	
	public void listarContactos() {}
	
}