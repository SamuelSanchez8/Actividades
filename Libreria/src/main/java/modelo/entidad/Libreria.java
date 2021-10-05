package modelo.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

@Table(name = "Librerias")
public class Libreria {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nombre;
	private String nombre_dueno;
	private String direccion;
	private List<Libro> listaLibros;
	
	//@ManyToMany
	//@JoinTable(name="librerias_libros",
			//   joinColumns= { @JoinColumn(name="fk_id_libreria", referencedColumnName="id") }, //FK que aporta Comercial
			//   inverseJoinColumns= { @JoinColumn(name="fk_id_libro", referencedColumnName="id")}) //FKs que aportan el resto de entidades
	// private List<Libro> libros;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_dueno() {
		return nombre_dueno;
	}
	public void setNombre_dueno(String nombre_dueno) {
		this.nombre_dueno = nombre_dueno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<Libro> getListaLibros() {
		return listaLibros;
	}
	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	@Override
	public String toString() {
		return "Libreria [id=" + id + ", nombre_dueno=" + nombre_dueno + ", direccion="
				+ direccion + ", coleccion_libros=" + "]";
	}

	
}
