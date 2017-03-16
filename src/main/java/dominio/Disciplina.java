package dominio;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Disciplina {

	private String nome;
	private Professor professor;
	
	public Disciplina(){}
	
	public Disciplina(String nome, Professor professor){
		this.nome = nome;
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() { return professor; }
	public void setProfessor(Professor professor) { this.professor = professor; }

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getNome())
				.append(getProfessor())
				.toHashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else if (o instanceof Disciplina) {
			Disciplina other = (Disciplina) o;
			return new EqualsBuilder()
					.append(getNome(), other.getNome())
					.append(getProfessor(), other.getProfessor())
					.isEquals();
		} else {
			return false;
		}
	}
}