package package1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contacto> listaContactos;

	// Constructor
	public Agenda() {
		this.listaContactos = new ArrayList<>();
	}

	// Agrega un contacto a la lista
	public void agregarContacto(Contacto c) {
		listaContactos.add(c);
		System.out.println("Contacto agregado: " + c.getNombre());
	}
	
	public void eliminarContacto(String nombre) {}
	
	public void buscarContacto(String nombre) {}
	
	public void listarContactos() {}
	
}