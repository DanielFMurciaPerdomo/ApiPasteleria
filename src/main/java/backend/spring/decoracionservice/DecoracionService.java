package backend.spring.decoracionservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.Decoracion;
import backend.spring.modelsDAO.IDecoracionDAO;
@Service
public class DecoracionService implements IDecoracionService {
	@Autowired
	private IDecoracionDAO decoraciondao;
	@Override
	public List<Decoracion> findAll() {
		// TODO Auto-generated method stub
		return decoraciondao.findAll();
	}

	@Override
	public Decoracion save(Decoracion e) {
		// TODO Auto-generated method stub
		return decoraciondao.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		decoraciondao.deleteById(id);
	}

	@Override
	public Decoracion searchById(Long id) {
		// TODO Auto-generated method stub
		return decoraciondao.findById(id).orElse(null);
	}

}
