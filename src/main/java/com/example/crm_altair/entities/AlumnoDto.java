package com.example.crm_altair.entities;

import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table(name = "familias", schema = "patata", uniqueConstraints = {@UniqueConstraint( name ="uk_alumnos_dni",columnNames ="dni_alumno" )} )	

public class AlumnoDto {
	
	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Familia")
	private long id_Alumno;
	
	@Column(name = "nombre_Padre", nullable = false, length = 512)
	private String nombre_Alimno;
	
	@Column(name = "apellidos_Padre", nullable = false, length = 512)
	private String apellidos_Alumno;
	
	@Column(name = "email_Madre", nullable = false, length = 512)
	private String dni_alumno;
	
	@Column(name = "telefono_Madre", nullable = false, length = 512)
	private String numero_SS;
	
	@Column(name = "direccion_Madre", nullable = false, length = 512)
	private String emain_Personal_Alumno;
	
	@Column(name = "codigo_Postal_Madre", nullable = false, length = 512)
	private String telefono_Alumno;
	
	@Column(name = "municipio_Madre", nullable = false, length = 512)
	private LocalDate fecha_Alta_Alumno;
	
	@Column(name = "provincia_Madre", nullable = false, length = 512)
	private LocalDate fecha_Baja_Alumno;
	
	@Column(name = "son_Separados")
	private String email_Colegio_Alumno;
	
	
	
	//Constructores
	
	public AlumnoDto() {}
	
	public AlumnoDto(long id_Alumno, String nombre_Alimno, String apellidos_Alumno, String dni_alumno, String numero_SS,
			String emain_Personal_Alumno, String telefono_Alumno, LocalDate fecha_Alta_Alumno, LocalDate fecha_Baja_Alumno,
			String email_Colegio_Alumno) {
		super();
		this.id_Alumno = id_Alumno;
		this.nombre_Alimno = nombre_Alimno;
		this.apellidos_Alumno = apellidos_Alumno;
		this.dni_alumno = dni_alumno;
		this.numero_SS = numero_SS;
		this.emain_Personal_Alumno = emain_Personal_Alumno;
		this.telefono_Alumno = telefono_Alumno;
		this.fecha_Alta_Alumno = fecha_Alta_Alumno;
		this.fecha_Baja_Alumno = fecha_Baja_Alumno;
		this.email_Colegio_Alumno = email_Colegio_Alumno;
	}
	
	//Getters and setters
	
	public long getId_Familia() {
		return id_Alumno;
	}
	public void setId_Familia(long id_Alumno) {
		this.id_Alumno = id_Alumno;
	}
	public String getNombre_Padre() {
		return nombre_Alimno;
	}
	public void setNombre_Padre(String nombre_Alimno) {
		this.nombre_Alimno = nombre_Alimno;
	}
	public String getApellidos_Padre() {
		return apellidos_Alumno;
	}
	public void setApellidos_Padre(String apellidos_Alumno) {
		this.apellidos_Alumno = apellidos_Alumno;
	}
	public String getEmail_Madre() {
		return dni_alumno;
	}
	public void setEmail_Madre(String dni_alumno) {
		this.dni_alumno = dni_alumno;
	}
	public String getTelefono_Madre() {
		return numero_SS;
	}
	public void setTelefono_Madre(String numero_SS) {
		this.numero_SS = numero_SS;
	}
	public String getDireccion_Madre() {
		return emain_Personal_Alumno;
	}
	public void setDireccion_Madre(String emain_Personal_Alumno) {
		this.emain_Personal_Alumno = emain_Personal_Alumno;
	}
	public String getCodigo_Postal_Madre() {
		return telefono_Alumno;
	}
	public void setCodigo_Postal_Madre(String telefono_Alumno) {
		this.telefono_Alumno = telefono_Alumno;
	}
	public LocalDate getMunicipio_Madre() {
		return fecha_Alta_Alumno;
	}
	public void setMunicipio_Madre(LocalDate fecha_Alta_Alumno) {
		this.fecha_Alta_Alumno = fecha_Alta_Alumno;
	}
	public LocalDate getProvincia_Madre() {
		return fecha_Baja_Alumno;
	}
	public void setProvincia_Madre(LocalDate fecha_Baja_Alumno) {
		this.fecha_Baja_Alumno = fecha_Baja_Alumno;
	}
	public String isSon_Separados() {
		return email_Colegio_Alumno;
	}
	public void setSon_Separados(String email_Colegio_Alumno) {
		this.email_Colegio_Alumno = email_Colegio_Alumno;
	}
	

}
