package dominio;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;

@XStreamAlias("Horario")
public class Horario {

	private int id;
	private int horainicio;
	private int horafim;
	private int minutoinicio;
	private int minutofim;
	private String dia;

	public Horario(){}
	
	public Horario(int id, int horainicio, int minutoinicio, int horafim, int minutofim, String dia){
		this.id = id;
		this.horainicio = horainicio;
		this.horafim = horafim;
		this.minutoinicio = minutoinicio;
		this.minutofim = minutofim;
		this.dia = dia;
	}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public int getHorainicio() {
		return horainicio;
	}
	public void setHorainicio(int horainicio) {
		this.horainicio = horainicio;
	}

	public int getHorafim() {
		return horafim;
	}
	public void setHorafim(int horafim) {
		this.horafim = horafim;
	}

	public int getMinutoinicio(){return minutoinicio;}
	public void setMinutoinicio(int minutoinicio){this.minutoinicio = minutoinicio;}

	public int getMinutofim(){return minutofim;}
	public void setMinutofim(int minutofim){this.minutofim = minutofim;}

	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(getDia())
				.append(getHorainicio())
				.append(getHorafim())
				.append(getMinutoinicio())
				.append(getMinutofim())
				.toHashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else if (o instanceof Horario) {
			Horario other = (Horario) o;
			return new EqualsBuilder()
					.append(getId(), other.getId())
					.append(getDia(), other.getDia())
					.append(getHorainicio(), other.getHorainicio())
					.append(getHorafim(), other.getHorafim())
					.append(getMinutoinicio(), other.getMinutoinicio())
					.append(getMinutofim(), other.getMinutofim())
					.isEquals();
		} else {
			return false;
		}
	}
}
