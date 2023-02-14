package exercicios;

import entity.Paciente;
import estruturasDeDados.FilaComPrioridade;

public class ExFilaPrioridade {
    public static void main(String[] args) {

        FilaComPrioridade<Paciente> filaComPrioridade = new FilaComPrioridade<>();

        Paciente p0 = new Paciente("Vinicius",3);
        Paciente p1 = new Paciente("Marlon",1);
        Paciente p2 = new Paciente("Davi",2);
        Paciente p3 = new Paciente("CRaudio",1);
        Paciente p4 = new Paciente("João",3);
        Paciente p5 = new Paciente("Cazuza",1);


        filaComPrioridade.enfileira(p0);
        filaComPrioridade.enfileira(p1);
        filaComPrioridade.enfileira(p2);
        filaComPrioridade.enfileira(p3);
        filaComPrioridade.enfileira(p4);
        filaComPrioridade.enfileira(p5);

        System.out.println(filaComPrioridade);
        System.out.println(filaComPrioridade.espiar());

    }
}
