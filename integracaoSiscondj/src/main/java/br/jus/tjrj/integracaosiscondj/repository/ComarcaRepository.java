package br.jus.tjrj.integracaoSiscondj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.jus.tjrj.integracaoSiscondj.model.ComarcaModel;

@Repository
public interface ComarcaRepository extends JpaRepository<ComarcaModel, Long> {
	
	@Query(value = " SELECT * FROM ORGAOJULGADOR ", nativeQuery = true)
	List<ComarcaModel> findAll();
	
	//ComarcaModel findByIdPJE(int codigoComarcaPJE);

}
