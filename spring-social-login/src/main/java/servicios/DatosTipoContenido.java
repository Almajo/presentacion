package servicios;
import java.util.List;

public class DatosTipoContenido {

	private String nombre;
	private List<DatosIdNombre> categorias;
	private List<DatosIdNombre> atributos;
	
	
	public DatosTipoContenido() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public List<DatosIdNombre> getCategorias() {
		return categorias;
	}



	public void setCategorias(List<DatosIdNombre> categorias) {
		this.categorias = categorias;
	}



	public List<DatosIdNombre> getAtributos() {
		return atributos;
	}



	public void setAtributos(List<DatosIdNombre> atributos) {
		this.atributos = atributos;
	}



	public DatosTipoContenido(String nombre, List<DatosIdNombre> categorias, List<DatosIdNombre> atributos) {
		super();
		this.nombre = nombre;
		this.categorias = categorias;
		this.atributos = atributos;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
