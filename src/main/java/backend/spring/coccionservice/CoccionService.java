package backend.spring.coccionservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.Coccion;
import backend.spring.modelsDAO.ICoccionDAO;
@Service
public class CoccionService implements ICoccionService {
	@Autowired
	private ICoccionDAO cocciondao;
	@Override
	public List<Coccion> findAll() {
		// TODO Auto-generated method stub
		return cocciondao.findAll();
	}

	@Override
	public Coccion save(Coccion e) {
		// TODO Auto-generated method stub
		return cocciondao.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cocciondao.deleteById(id);
	}

	@Override
	public Coccion searchById(Long id) {
		// TODO Auto-generated method stub
		return cocciondao.findById(id).orElse(null);
	}

}
