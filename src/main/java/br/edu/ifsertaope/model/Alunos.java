package br.edu.ifsertaope.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;

  
@Entity  
// Definindo a tabela 
@Table  
public class Alunos {
	//Definindo alunoid como primary key  
	@Id  
	@Column  
	private int alunoid;  
	@Column  
	private String alunonome;  
	@Column  
	private String email;  
	@Column  
	private int telefone;
	public int getAlunoid() {
		return alunoid;
	}
	public void setAlunoid(int alunoid) {
		this.alunoid = alunoid;
	}
	public String getAlunoname() {
		return alunonome;
	}
	public void setAlunoname(String alunoname) {
		this.alunonome = alunoname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}  
	
}
