package backend.spring.pastelservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.Pastel;
import backend.spring.modelsDAO.IPastelDAO;

@Service
public class PastelService implements IPastelService {
	@Autowired
	private IPastelDAO pasteldao;
	@Override
	public List<Pastel> findAll() {
		// TODO Auto-generated method stub
		return pasteldao.findAll();
	}

	@Override
	public Pastel save(Pastel e) {
		// TODO Auto-generated method stub
		return pasteldao.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pasteldao.deleteById(id);
	}

	@Override
	public Pastel searchById(Long id) {
		// TODO Auto-generated method stub
		return pasteldao.findById(id).orElse(null);
	}

}
