package backend.spring.pasteleroservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.Pastelero;
import backend.spring.modelsDAO.IPasteleroDAO;

@Service
public class PasteleroService implements IPasteleroService {
	@Autowired
	private IPasteleroDAO pastelerodao;
	
	@Override
	public List<Pastelero> findAll(){
		return pastelerodao.findAll();
	}

	@Override
	public Pastelero save(Pastelero p) {
		// TODO Auto-generated method stub
		return pastelerodao.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pastelerodao.deleteById(id);
	}

	@Override
	public Pastelero encontrarporId(Long id) {
		// TODO Auto-generated method stub
		return pastelerodao.findById(id).orElse(null);
	}
	
}
