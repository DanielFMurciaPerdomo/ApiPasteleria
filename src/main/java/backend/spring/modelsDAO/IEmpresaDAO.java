package backend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.spring.modelentity.Empresa;

public interface IEmpresaDAO extends JpaRepository<Empresa, Long>{

}
