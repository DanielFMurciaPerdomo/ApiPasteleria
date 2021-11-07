package backend.spring.decoradorservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.Decorador;
import backend.spring.modelsDAO.IDecoradorDAO;

@Service
public class DecoradorService implements IDecoradorService{
	@Autowired
	private IDecoradorDAO decoradordao;

	@Override
	public List<Decorador> findAll() {
		// TODO Auto-generated method stub
		return decoradordao.findAll();
	}

	@Override
	public Decorador save(Decorador e) {
		// TODO Auto-generated method stub
		return decoradordao.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		decoradordao.deleteById(id);
	}

	@Override
	public Decorador searchById(Long id) {
		// TODO Auto-generated method stub
		return decoradordao.findById(id).orElse(null);
	}
}
