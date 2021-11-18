package backend.spring.coccionservice;

import java.util.List;

import backend.spring.modelentity.Coccion;

public interface ICoccionService {
	public List<Coccion> findAll();
	public Coccion save(Coccion e);
	public void delete(Long id);
	public Coccion searchById(Long id);
}
