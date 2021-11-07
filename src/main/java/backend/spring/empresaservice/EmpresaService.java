package backend.spring.empresaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.Empresa;
import backend.spring.modelsDAO.IEmpresaDAO;
@Service
public class EmpresaService implements IEmpresaService{
	@Autowired
	private IEmpresaDAO empresadao;
	@Override
	public List<Empresa> findAll() {
		// TODO Auto-generated method stub
		return empresadao.findAll();
	}

	@Override
	public Empresa save(Empresa e) {
		// TODO Auto-generated method stub
		return empresadao.save(e);
	}

	@Override
	public void delete(Long nit) {
		// TODO Auto-generated method stub
		empresadao.deleteById(nit);
	}

	@Override
	public Empresa searchById(Long nit) {
		// TODO Auto-generated method stub
		return empresadao.findById(nit).orElse(null);
	}

}
