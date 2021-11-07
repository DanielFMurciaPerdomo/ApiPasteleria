package backend.spring.ingredienteservice;

import java.util.List;

import backend.spring.modelentity.Ingrediente;

public interface IIngredienteService {
	public List<Ingrediente> findAll();
	public Ingrediente save(Ingrediente e);
	public void delete(String id);
	public Ingrediente searchById(String id);
}
