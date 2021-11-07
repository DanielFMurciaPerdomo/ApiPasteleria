package backend.spring.ingredienteservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.Ingrediente;
import backend.spring.modelsDAO.IIngredienteDAO;
@Service
public class IngredienteService implements IIngredienteService{
	@Autowired
	private IIngredienteDAO ingredientedao;
	@Override
	public List<Ingrediente> findAll() {
		// TODO Auto-generated method stub
		return ingredientedao.findAll();
	}

	@Override
	public Ingrediente save(Ingrediente e) {
		// TODO Auto-generated method stub
		return ingredientedao.save(e);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		ingredientedao.deleteById(id);
	}

	@Override
	public Ingrediente searchById(String id) {
		// TODO Auto-generated method stub
		return ingredientedao.findById(id).orElse(null);
	}

}
