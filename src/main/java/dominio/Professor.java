package dominio;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Professor {

	private String nome;
	
	public Professor(){}
	
	public Professor(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getNome())
				.toHashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else if (o instanceof Professor) {
			Professor other = (Professor) o;
			return new EqualsBuilder()
					.append(getNome(), other.getNome())
					.isEquals();
		} else {
			return false;
		}
	}

}
