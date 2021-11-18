package backend.spring.coccionempservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.CoccionEmp;
import backend.spring.modelsDAO.ICoccionEmpDAO;
@Service
public class CoccionEmpService implements ICoccionEmpService{
	@Autowired
	private ICoccionEmpDAO coccionempdao;
	@Override
	public List<CoccionEmp> findAll() {
		// TODO Auto-generated method stub
		return coccionempdao.findAll();
	}

	@Override
	public CoccionEmp save(CoccionEmp e) {
		// TODO Auto-generated method stub
		return coccionempdao.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		coccionempdao.deleteById(id);
	}

	@Override
	public CoccionEmp searchById(Long id) {
		// TODO Auto-generated method stub
		return coccionempdao.findById(id).orElse(null);
	}

}
