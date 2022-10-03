package jdbc.modelo;

import java.sql.Date;

public class Huespedes {
	private Integer Id;
	private String Nombre;
	private String Apellido;
	private Date Fecha_Nacimiento;
	private String Nacionalidad;
	private String Telefono;
	private Integer Id_Reserva;
	
	public Huespedes(String nombre, String apellido,  Date fechaNacimiento, String nacionalidad, String telefono,
			Integer idReserva) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Fecha_Nacimiento = fechaNacimiento;
		Nacionalidad = nacionalidad;
		Telefono = telefono;
		Id_Reserva = idReserva;
	}
	
	public Huespedes(Integer id, String nombre, String apellido, Date fechaNacimiento, String nacionalidad,
			String telefono, Integer idReserva) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
		Fecha_Nacimiento = fechaNacimiento;
		Nacionalidad = nacionalidad;
		Telefono = telefono;
		Id_Reserva = idReserva;
	}


	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}


	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public Date getFechaNacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		Fecha_Nacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public Integer getIdReserva() {
		return Id_Reserva;
	}

	public void setIdReserva(Integer idReserva) {
		Id_Reserva = idReserva;
	}
	
}
