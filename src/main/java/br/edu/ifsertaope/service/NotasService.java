package br.edu.ifsertaope.service;
//import java.util.ArrayList;
import java.util.List;
import br.edu.ifsertaope.model.Notas;
import br.edu.ifsertaope.repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.ifsertaope.model.Alunos;
import br.edu.ifsertaope.repository.AlunoRepository;

@Service

public class NotasService {
	
	@Autowired
    NotasRepository notasRepository;

    @Autowired
    AlunoRepository alunoRepository;

    public List<Notas> getAllNotas()
    {
        return (List<Notas>) notasRepository.findAll();
    }

    public List<Notas> getNotasByAluno(int idAluno)
    {
        Alunos aluno = alunoRepository.findById(idAluno).get();
        return notasRepository.findByAluno(aluno);
    }

    public void saveOrUpdate(Notas nota)
    {
        notasRepository.save(nota);
    }

    public void delete(int id)
    {
        notasRepository.deleteById(id);
    }
	
}
