package backend.spring.pastelservice;

import java.util.List;

import backend.spring.modelentity.Pastel;

public interface IPastelService {
	public List<Pastel> findAll();
	public Pastel save(Pastel e);
	public void delete(Long id);
	public Pastel searchById(Long id);
}
