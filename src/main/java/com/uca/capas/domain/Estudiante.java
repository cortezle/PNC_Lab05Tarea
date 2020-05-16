package com.uca.capas.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public",name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer C_usuario;
	
	@Column(name="nombre")
	@Size(message = "El campo nombre no puede tener mas de 50 caracteres", max=50)
	@NotEmpty(message = "El campo nombre no puede ser vacío")
	private String Nombre;
	
	@Column(name="apellido")
	@Size(message = "El campo nombre no puede tener mas de 50 caracteres", max=50)
	@NotEmpty(message = "El campo nombre no puede ser vacío")
	private String Apellido;
	
	@Size(message = "El campo nombre tiene que tener 10 caracteres", max=10)
	@NotEmpty(message = "El campo nombre no puede ser vacío")
	@Column(name="carne")
	private String Carne;
	
	@Size(message = "El campo nombre no puede tener mas de 100 caracteres", max=100)
	@NotEmpty(message = "El campo nombre no puede ser vacío")
	@Column(name="carrera")
	private String Carrera;
	
	

	public Integer getC_usuario() {
		return C_usuario;
	}



	public void setC_usuario(Integer c_usuario) {
		C_usuario = c_usuario;
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



	public String getCarne() {
		return Carne;
	}



	public void setCarne(String carne) {
		Carne = carne;
	}



	public String getCarrera() {
		return Carrera;
	}



	public void setCarrera(String carrera) {
		Carrera = carrera;
	}



	public Estudiante() {
		
	}
	

}
