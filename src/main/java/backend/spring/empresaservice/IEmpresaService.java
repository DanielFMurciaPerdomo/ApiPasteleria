package backend.spring.empresaservice;

import java.util.List;

import backend.spring.modelentity.Empresa;

public interface IEmpresaService {
	public List<Empresa> findAll();
	public Empresa save(Empresa e);
	public void delete(Long nit);
	public Empresa searchById(Long nit);
}
