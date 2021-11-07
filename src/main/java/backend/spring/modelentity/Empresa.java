package backend.spring.modelentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresas")
public class Empresa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long nit;
	@Column
	private String nombre;
	@Column
	private String dirección;
	
	public Long getNit() {
		return nit;
	}
	public void setNit(Long nit) {
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}
	
}
