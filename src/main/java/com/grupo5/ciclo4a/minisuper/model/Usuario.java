package com.grupo5.ciclo4a.minisuper.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Usuarios")
public class Usuario {
	
	@Id
	private String id;
	
	private String username;
	private String password;
	private String nombrecompleto;
	private String email;
	
	public Usuario() {
		//TODO Auto-generated constructor stub
	}
	

	public Usuario(String username, String password, String nombrecompleto, String email) {
		super();
		this.username = username;
		this.password = password;
		this.nombrecompleto = nombrecompleto;
		this.email = email;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the nombre_completo
	 */
	public String getNombrecompleto() {
		return nombrecompleto;
	}
	/**
	 * @param nombre_completo the nombre_completo to set
	 */
	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
