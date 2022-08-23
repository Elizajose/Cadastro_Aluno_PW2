package br.edu.ifsertaope.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
//import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifsertaope.model.Alunos;
import br.edu.ifsertaope.service.AlunosService;
@RestController 
public class AlunoController {
	
	@Autowired  
	AlunosService alunosService;  
	   
	@GetMapping("/aluno")  
	private List<Alunos> getAllAlunos()   
	{  
	return alunosService.getAllAlunos();  
	}  
	 
	@GetMapping("/aluno/{alunoid}")  
	private Alunos getAlunos(@PathVariable("alunoid") int alunoid)   
	{  
	return alunosService.getAlunosById(alunoid);  
	}  
	  
	@DeleteMapping("/aluno/{alunoid}")  
	private void deleteAluno(@PathVariable("alunoid") int alunoid)   
	{  
	alunosService.delete(alunoid);  
	}  
	 
	@PostMapping("/alunos")  
	private int saveAluno(@RequestBody Alunos alunos)   
	{  
	alunosService.saveOrUpdate(alunos);  
	return alunos.getAlunoid();  
	}  
	  
	//@PutMapping("/alunos")  
	//private Alunos update(@RequestBody Alunos aluno)   
	{  
	//alunosService.saveOrUpdate(alunos);  
	//return alunos;  
	}  
}
