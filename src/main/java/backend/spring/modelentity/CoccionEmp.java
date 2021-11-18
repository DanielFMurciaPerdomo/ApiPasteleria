package backend.spring.modelentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coccionesemp")
public class CoccionEmp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigoHorEmp;
	@Column
	private String marca;
	@Column
	private double valorEstimado;
	@Column
	private double tempCoccion;
	@Column
	private String fechaHoraInicio;
	@Column
	private String fechaHoraFinal;
	public Long getCodigoHorEmp() {
		return codigoHorEmp;
	}
	public void setCodigoHorEmp(Long codigoHorEmp) {
		this.codigoHorEmp = codigoHorEmp;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValorEstimado() {
		return valorEstimado;
	}
	public void setValorEstimado(double valorEstimado) {
		this.valorEstimado = valorEstimado;
	}
	public double getTempCoccion() {
		return tempCoccion;
	}
	public void setTempCoccion(double tempCoccion) {
		this.tempCoccion = tempCoccion;
	}
	public String getFechaHoraInicio() {
		return fechaHoraInicio;
	}
	public void setFechaHoraInicio(String fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}
	public String getFechaHoraFinal() {
		return fechaHoraFinal;
	}
	public void setFechaHoraFinal(String fechaHoraFinal) {
		this.fechaHoraFinal = fechaHoraFinal;
	}
}
