package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Paciente implements Comparable<Paciente> {

    private String nome;
    private int prioridade;

    @Override
    public int compareTo(Paciente outroPaciente) {
        if (this.prioridade > outroPaciente.prioridade) {
            return 1;
        } else if (this.prioridade < outroPaciente.prioridade) {
            return -1;
        } else {
            return 0;
        }
    }


}
