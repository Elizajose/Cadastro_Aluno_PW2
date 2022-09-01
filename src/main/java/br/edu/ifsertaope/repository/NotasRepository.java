package br.edu.ifsertaope.repository;

import br.edu.ifsertaope.model.Alunos;
import br.edu.ifsertaope.model.Notas;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface NotasRepository extends CrudRepository<Notas, Integer>{
	
	List<Notas> findByAluno(Alunos alunos);
	
}
