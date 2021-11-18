package backend.spring.decoracionempservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.DecoracionEmp;
import backend.spring.modelsDAO.IDecoracionEmpDAO;
@Service
public class DecoracionEmpService implements IDecoracionEmpService {
	@Autowired
	private IDecoracionEmpDAO decoracionempdao;
	@Override
	public List<DecoracionEmp> findAll() {
		// TODO Auto-generated method stub
		return decoracionempdao.findAll();
	}

	@Override
	public DecoracionEmp save(DecoracionEmp e) {
		// TODO Auto-generated method stub
		return decoracionempdao.save(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		decoracionempdao.deleteById(id);
	}

	@Override
	public DecoracionEmp searchById(Long id) {
		// TODO Auto-generated method stub
		return decoracionempdao.findById(id).orElse(null);
	}

}
