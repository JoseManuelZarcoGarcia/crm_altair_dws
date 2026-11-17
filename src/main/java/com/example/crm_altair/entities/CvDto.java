package com.example.crm_altair.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "familias", schema = "patata", uniqueConstraints = {@UniqueConstraint( name ="",columnNames ="" )} )	

public class CvDto {
	
	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Familia")
	private long id_Familia;
	
	@Column(name = "nombre_Padre", nullable = false, length = 512)
	private String nombre_Padre;
	
	@Column(name = "nombre_Madre", nullable = false, length = 512)
	private String nombre_Madre;
	
	@Column(name = "apellidos_Padre", nullable = false, length = 512)
	private String apellidos_Padre;
	
	@Column(name = "apellidos_Madre", nullable = false, length = 512)
	private String apellidos_Madre;
	
	@Column(name = "email_Padre", nullable = false, length = 512)
	private String email_Padre;
	
	@Column(name = "email_Madre", nullable = false, length = 512)
	private String email_Madre;
	
	@Column(name = "telefono_Padre", nullable = false, length = 512)
	private String telefono_Padre;
	
	@Column(name = "telefono_Madre", nullable = false, length = 512)
	private String telefono_Madre;
	
	@Column(name = "direccion_Padre", nullable = false, length = 512)
	private String direccion_Padre;
	
	@Column(name = "direccion_Madre", nullable = false, length = 512)
	private String direccion_Madre;
	
	@Column(name = "codigo_Postal_Padre", nullable = false, length = 512)
	private String codigo_Postal_Padre;
	
	@Column(name = "codigo_Postal_Madre", nullable = false, length = 512)
	private String codigo_Postal_Madre;
	
	@Column(name = "municipio_Padre", nullable = false, length = 512)
	private String municipio_Padre;
	
	@Column(name = "municipio_Madre", nullable = false, length = 512)
	private String municipio_Madre;
	
	@Column(name = "provincia_Padre", nullable = false, length = 512)
	private String provincia_Padre;
	
	@Column(name = "provincia_Madre", nullable = false, length = 512)
	private String provincia_Madre;
	
	@Column(name = "son_Separados")
	private boolean son_Separados;
	
	@Column(name = "es_Compartida")
	private boolean es_Compartida;
	
	@Column(name = "es_Padre")
	private boolean es_Padre;
	
	@Column(name = "es_Madre")
	private boolean es_Madre;
	
	
	
	//Constructores
	
	public CvDto() {}
	
	public CvDto(long id_Familia, String nombre_Padre, String nombre_Madre, String apellidos_Padre,
			String apellidos_Madre, String email_Padre, String email_Madre, String telefono_Padre,
			String telefono_Madre, String direccion_Padre, String direccion_Madre, String codigo_Postal_Padre,
			String codigo_Postal_Madre, String municipio_Padre, String municipio_Madre, String provincia_Padre,
			String provincia_Madre, boolean son_Separados, boolean es_Compartida, boolean es_Padre, boolean es_Madre) {
		super();
		this.id_Familia = id_Familia;
		this.nombre_Padre = nombre_Padre;
		this.nombre_Madre = nombre_Madre;
		this.apellidos_Padre = apellidos_Padre;
		this.apellidos_Madre = apellidos_Madre;
		this.email_Padre = email_Padre;
		this.email_Madre = email_Madre;
		this.telefono_Padre = telefono_Padre;
		this.telefono_Madre = telefono_Madre;
		this.direccion_Padre = direccion_Padre;
		this.direccion_Madre = direccion_Madre;
		this.codigo_Postal_Padre = codigo_Postal_Padre;
		this.codigo_Postal_Madre = codigo_Postal_Madre;
		this.municipio_Padre = municipio_Padre;
		this.municipio_Madre = municipio_Madre;
		this.provincia_Padre = provincia_Padre;
		this.provincia_Madre = provincia_Madre;
		this.son_Separados = son_Separados;
		this.es_Compartida = es_Compartida;
		this.es_Padre = es_Padre;
		this.es_Madre = es_Madre;
	}
	
	
	//Getters and setters
	
	public long getId_Familia() {
		return id_Familia;
	}
	public void setId_Familia(long id_Familia) {
		this.id_Familia = id_Familia;
	}
	public String getNombre_Padre() {
		return nombre_Padre;
	}
	public void setNombre_Padre(String nombre_Padre) {
		this.nombre_Padre = nombre_Padre;
	}
	public String getNombre_Madre() {
		return nombre_Madre;
	}
	public void setNombre_Madre(String nombre_Madre) {
		this.nombre_Madre = nombre_Madre;
	}
	public String getApellidos_Padre() {
		return apellidos_Padre;
	}
	public void setApellidos_Padre(String apellidos_Padre) {
		this.apellidos_Padre = apellidos_Padre;
	}
	public String getApellidos_Madre() {
		return apellidos_Madre;
	}
	public void setApellidos_Madre(String apellidos_Madre) {
		this.apellidos_Madre = apellidos_Madre;
	}
	public String getEmail_Padre() {
		return email_Padre;
	}
	public void setEmail_Padre(String email_Padre) {
		this.email_Padre = email_Padre;
	}
	public String getEmail_Madre() {
		return email_Madre;
	}
	public void setEmail_Madre(String email_Madre) {
		this.email_Madre = email_Madre;
	}
	public String getTelefono_Padre() {
		return telefono_Padre;
	}
	public void setTelefono_Padre(String telefono_Padre) {
		this.telefono_Padre = telefono_Padre;
	}
	public String getTelefono_Madre() {
		return telefono_Madre;
	}
	public void setTelefono_Madre(String telefono_Madre) {
		this.telefono_Madre = telefono_Madre;
	}
	public String getDireccion_Padre() {
		return direccion_Padre;
	}
	public void setDireccion_Padre(String direccion_Padre) {
		this.direccion_Padre = direccion_Padre;
	}
	public String getDireccion_Madre() {
		return direccion_Madre;
	}
	public void setDireccion_Madre(String direccion_Madre) {
		this.direccion_Madre = direccion_Madre;
	}
	public String getCodigo_Postal_Padre() {
		return codigo_Postal_Padre;
	}
	public void setCodigo_Postal_Padre(String codigo_Postal_Padre) {
		this.codigo_Postal_Padre = codigo_Postal_Padre;
	}
	public String getCodigo_Postal_Madre() {
		return codigo_Postal_Madre;
	}
	public void setCodigo_Postal_Madre(String codigo_Postal_Madre) {
		this.codigo_Postal_Madre = codigo_Postal_Madre;
	}
	public String getMunicipio_Padre() {
		return municipio_Padre;
	}
	public void setMunicipio_Padre(String municipio_Padre) {
		this.municipio_Padre = municipio_Padre;
	}
	public String getMunicipio_Madre() {
		return municipio_Madre;
	}
	public void setMunicipio_Madre(String municipio_Madre) {
		this.municipio_Madre = municipio_Madre;
	}
	public String getProvincia_Padre() {
		return provincia_Padre;
	}
	public void setProvincia_Padre(String provincia_Padre) {
		this.provincia_Padre = provincia_Padre;
	}
	public String getProvincia_Madre() {
		return provincia_Madre;
	}
	public void setProvincia_Madre(String provincia_Madre) {
		this.provincia_Madre = provincia_Madre;
	}
	public boolean isSon_Separados() {
		return son_Separados;
	}
	public void setSon_Separados(boolean son_Separados) {
		this.son_Separados = son_Separados;
	}
	public boolean isEs_Compartida() {
		return es_Compartida;
	}
	public void setEs_Compartida(boolean es_Compartida) {
		this.es_Compartida = es_Compartida;
	}
	public boolean isEs_Padre() {
		return es_Padre;
	}
	public void setEs_Padre(boolean es_Padre) {
		this.es_Padre = es_Padre;
	}
	public boolean isEs_Madre() {
		return es_Madre;
	}
	public void setEs_Madre(boolean es_Madre) {
		this.es_Madre = es_Madre;
	}
	

}
