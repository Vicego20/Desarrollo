package com.example.demo.models.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/*SE LLAMA DECORADOR TABLE PARA MODIFICAR EL NOMBRE DE LA CLASE
 * COMO BUENA PRACTICA PARA QUE EN LA BASE DE DATOS SE ALMACENE Y SE CREE LA TABLA COMO= CLIENTES DEACUERDO A LA NOTACION
 *  Y ADEMAS SE PUEDA SIEMPRE IDENTIFICAR COMO CLIENTES     */

@Entity
@Table(name="clientes")
public class Cliente  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/*
	 CLASE CLIENTE QUE ES LA TABLA EN LA BASE DE DATOS 
	 SE IMPORTA EL SERIALIZABLE PARA OPTIMIZAR LA BUSQUEDA DE DATOS 
	 */
	
	@Id    /*PARA DETERMINAR LA LLAVE PRIMARIA*/
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*PARA DETERMINAR LA FORMA COMO SE GENERARAN LOS DATOS 
	SEA BASE DE DATOS MY SQL (IDENTITY) O EN SU DEFECTO ORACLE SE UTILIZARIA(SEQUENCE )
	*/
	private long id;
	
	private String nombre;
	private String apellido;
	private String email;
	
	@Column(name="create_at")/*PASAR DATO CREATED AT A CREATED_AT */
	
	/*REALIZAR MODIFICAR Y PASAR DE DATO DATE EN JAVA PARA PASAR A DATE EN SQL */
	@Temporal(TemporalType.DATE)
	private Date createAt;

	/*
	 SE IMPORTAN LUEGO DE DEJARLO EN CLICK DERECHO SOURCES Y EN GETTERS AND SETTERS
	 ESTO PARA REALIZAR OBTENER EL DATO DE LA BASE DE DATOS Y PODER MODIFICARLO 
	 LUEGO FORMAT PARA QUE QUEDE ORGANIZADO 
	 GETID= BUSCAR
	 SETID= MODIFICAR
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

}
