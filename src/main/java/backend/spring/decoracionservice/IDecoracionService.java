package backend.spring.decoracionservice;

import java.util.List;

import backend.spring.modelentity.Decoracion;

public interface IDecoracionService {
	public List<Decoracion> findAll();
	public Decoracion save(Decoracion e);
	public void delete(Long id);
	public Decoracion searchById(Long id);
}
