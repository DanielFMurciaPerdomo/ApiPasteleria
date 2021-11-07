package backend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.spring.modelentity.Ingrediente;

public interface IIngredienteDAO extends JpaRepository<Ingrediente, String>{

}
