package br.edu.ifsertaope.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import br.edu.ifsertaope.model.Alunos;  
import br.edu.ifsertaope.repository.AlunoRepository;

 
//Definindo como será nossa regra de negocio. 
@Service  

public class AlunosService {
	@Autowired  
	AlunoRepository alunosRepository;  
	  
	public List<Alunos> getAllAlunos()   
	{  
	List<Alunos> alunos = new ArrayList<Alunos>();  
	alunosRepository.findAll().forEach(alunos1 -> alunos.add(alunos1));  
	return alunos;  
	}  
	  
	public Alunos getAlunosById(int id)   
	{  
	return alunosRepository.findById(id).get();  
	}  
	  
	public void saveOrUpdate(Alunos alunos)   
	{  
	alunosRepository.save(alunos);  
	}  
	 
	public void delete(int id)   
	{  
	alunosRepository.deleteById(id);  
	}  
	 
	public void update(Alunos alunos, int alunoid)   
	{  
	alunosRepository.save(alunos);  
	}
}
