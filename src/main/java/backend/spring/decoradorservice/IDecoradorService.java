package backend.spring.decoradorservice;

import java.util.List;

import backend.spring.modelentity.Decorador;

public interface IDecoradorService {
	public List<Decorador> findAll();
	public Decorador save(Decorador e);
	public void delete(Long id);
	public Decorador searchById(Long id);
}
