package dominio;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import difficulty.AlocacaoDifficultyComparator;
import difficulty.HorarioStrengthComparator;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity(difficultyComparatorClass = AlocacaoDifficultyComparator.class)
@XStreamAlias("Alocacao")
public class Alocacao {

	private boolean locked;

	private Disciplina disciplina;

	//planning variables
	private Horario horario;
	private Turma turma;


	public Alocacao(){}
	public Alocacao(Disciplina disciplina, Turma turma){
		this.setDisciplina(disciplina);
		this.setTurma(turma);
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	
	@PlanningVariable(valueRangeProviderRefs = {"Horario"},
			strengthComparatorClass = HorarioStrengthComparator.class)
	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	
	@Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getDisciplina())
				.append(getTurma())
                .toHashCode();
    }
	
	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Alocacao) {
            Alocacao other = (Alocacao) o;
            return new EqualsBuilder()
                    .append(getDisciplina(), other.getDisciplina())
					.append(getTurma(), other.getTurma())
					.append(getHorario(), other.getHorario())
                    .isEquals();
        } else {
            return false;
        }
    }
}