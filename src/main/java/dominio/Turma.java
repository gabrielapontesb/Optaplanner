package dominio;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@XStreamAlias("Turma")
public class Turma {

	private int id;
	private String nome;
	private int sala;
	
	public Turma(){}
	
	public Turma(int id, String nome, int sala){
		this.id = id;
		this.nome = nome;
		this.sala = sala;
	}

	public int getId(){ return id;}
	public void setId(int id){ this.id = id; }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	
	@Override
    public int hashCode() {
        return new HashCodeBuilder()
				.append(getSala())
                .append(getNome())
                .toHashCode();
    }

    @Override
	public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Turma) {
        	Turma other = (Turma) o;
            return new EqualsBuilder()
					.append(getSala(), other.getSala())
                    .append(getNome(), other.getNome())
                    .isEquals();
        } else {
            return false;
        }
    }
		
}
