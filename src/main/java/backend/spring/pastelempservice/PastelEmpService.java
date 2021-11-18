package backend.spring.pastelempservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.PastelEmp;
import backend.spring.modelsDAO.IPastelEmpDAO;
@Service
public class PastelEmpService implements IPastelEmpService {
	@Autowired
	private IPastelEmpDAO pastelempdao;
	@Override
	public List<PastelEmp> findAll() {
		// TODO Auto-generated method stub
		return pastelempdao.findAll();
	}

	@Override
	public PastelEmp save(PastelEmp e) {
		// TODO Auto-generated method stub
		return pastelempdao.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pastelempdao.deleteById(id);
	}

	@Override
	public PastelEmp searchById(Long id) {
		// TODO Auto-generated method stub
		return pastelempdao.findById(id).orElse(null);
	}

}
