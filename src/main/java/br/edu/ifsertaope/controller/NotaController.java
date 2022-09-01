package br.edu.ifsertaope.controller;

//import br.edu.ifsertaope.model.Alunos;
import br.edu.ifsertaope.model.Notas;
import br.edu.ifsertaope.service.AlunosService;
import br.edu.ifsertaope.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NotaController {
	@Autowired
    NotasService notasService;

    @Autowired
    AlunosService alunosService;

    @GetMapping("/notas")
    private List<Notas> getAllNotas()
    {
        return notasService.getAllNotas();
    }

    @GetMapping("/notas/{alunoid}")
    private List<Notas> getNotas(@PathVariable("alunoid") int alunoid)
    {
        return notasService.getNotasByAluno(alunoid);
    }

    @DeleteMapping("/nota/{notaId}")
    private void deleteNota(@PathVariable("notaId") int alunoid)
    {
        notasService.delete(alunoid);
    }

    @PostMapping("/nota")
    private int saveNota(@RequestBody Notas nota)
    {
        notasService.saveOrUpdate(nota);
        return nota.getNotaid();
    }

    @PutMapping("/nota/{notaId}")
    private Notas update(@PathVariable int notaId, @RequestBody Notas nota)
    {
        nota.setNotaid(notaId);
        notasService.saveOrUpdate(nota);
        return nota;
    }
	
}
