package backend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.spring.modelentity.Pastel;

public interface IPastelDAO extends JpaRepository<Pastel, Long>{

}
