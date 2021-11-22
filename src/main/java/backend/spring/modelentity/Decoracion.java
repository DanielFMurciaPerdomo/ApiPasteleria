package backend.spring.modelentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="decoraciones")
public class Decoracion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigoDecor;
	@Column
	private String fechaHoraInicio;
	@Column
	private String fechaHoraFin;
	@Column
	private double pesoFinal;
	@Column
	private String decorador;
	
	public Long getCodigoDecor() {
		return codigoDecor;
	}
	public void setCodigoDecor(Long codigoDecor) {
		this.codigoDecor = codigoDecor;
	}
	public String getFechaHoraInicio() {
		return fechaHoraInicio;
	}
	public void setFechaHoraInicio(String fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}
	public String getFechaHoraFin() {
		return fechaHoraFin;
	}
	public void setFechaHoraFin(String fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}
	public double getPesoFinal() {
		return pesoFinal;
	}
	public void setPesoFinal(double pesoFinal) {
		this.pesoFinal = pesoFinal;
	}
	public String getDecorador() {
		return decorador;
	}
	public void setDecorador(String decorador) {
		this.decorador = decorador;
	}
	
}
