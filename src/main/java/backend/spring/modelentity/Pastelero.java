package backend.spring.modelentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pasteleros")
public class Pastelero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigoPast;
	@Column
	private String nombre;
	@Column
	private double salario;
	@Column
	private String pasaporte;
	@Column
	private String paisOgn;
	@Column
	private int experiencia;
	
	public Long getCodigoPast() {
		return codigoPast;
	}
	public void setCodigoPast(Long codigoPast) {
		this.codigoPast = codigoPast;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}
	public String getPaisOgn() {
		return paisOgn;
	}
	public void setPaisOgn(String paisOgn) {
		this.paisOgn = paisOgn;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
}
