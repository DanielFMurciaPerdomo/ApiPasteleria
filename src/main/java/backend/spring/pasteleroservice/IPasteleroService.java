package backend.spring.pasteleroservice;

import java.util.List;

import backend.spring.modelentity.Pastelero;

public interface IPasteleroService {
	public List<Pastelero> findAll();
	public Pastelero save (Pastelero p);
	public void delete(Long id);
	public Pastelero encontrarporId(Long id);
}
