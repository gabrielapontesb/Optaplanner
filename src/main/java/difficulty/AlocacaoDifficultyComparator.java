package difficulty;

import dominio.Alocacao;
import org.apache.commons.lang.builder.CompareToBuilder;

import java.util.Comparator;

public class AlocacaoDifficultyComparator implements Comparator<Alocacao> {

    public int compare(Alocacao alocacao1, Alocacao alocacao2) {
        return new CompareToBuilder()
        		.append(alocacao1.getHorario(), alocacao2.getHorario())
//                .append(alocacao1.getTurma(), alocacao2.getTurma())
                .toComparison();
    }
}