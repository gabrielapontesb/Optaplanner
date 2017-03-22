package difficulty;

import dominio.Horario;
import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Comparator;

public class HorarioStrengthComparator implements Comparator<Horario> {
	
    public int compare(Horario horario1, Horario horario2) {
        return new CompareToBuilder()
                .append(horario1.getHorainicio(), horario2.getHorainicio())
                .append(horario1.getHorafim(), horario2.getHorafim())
                .append(horario1.getMinutoinicio(), horario2.getMinutoinicio())
                .append(horario1.getMinutofim(), horario2.getMinutofim())
                .append(horario1.getDia(), horario2.getDia())
                .toComparison();
    }
}