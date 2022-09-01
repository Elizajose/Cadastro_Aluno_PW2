package br.edu.ifsertaope.model;

import javax.persistence.*;

@Entity
//Definindo a tabela
@Table
public class Notas {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int notaid;

    @ManyToOne
    @JoinColumn(name = "aluno_alunoid")
    private Alunos aluno = new Alunos();
    @Column
    private double nota;

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public int getNotaid() {
        return notaid;
    }

    public void setNotaid(int notaid) {
        this.notaid = notaid;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
	
	
}
