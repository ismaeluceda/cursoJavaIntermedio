package modelo.entidades;


//esta anotacion es equivalente a lo siguiente en xml:
//<bean id="director" class="modelo.entidades.Director" scope="singleton"/>

public class Director {

	private String nombre;
	private int edad;

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

	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
