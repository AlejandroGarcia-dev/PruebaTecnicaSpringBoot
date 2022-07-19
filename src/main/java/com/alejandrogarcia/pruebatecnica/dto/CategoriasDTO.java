package com.alejandrogarcia.pruebatecnica.dto;

public class CategoriasDTO {

	private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	public CategoriasDTO() {
		super();
	}

	public CategoriasDTO(Long id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
