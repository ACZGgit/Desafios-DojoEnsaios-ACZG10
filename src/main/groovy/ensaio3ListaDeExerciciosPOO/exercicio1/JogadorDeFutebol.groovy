package ensaio3ListaDeExerciciosPOO.exercicio1

import org.apache.groovy.parser.antlr4.util.PositionConfigureUtils

import java.text.BreakIterator
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class JogadorDeFutebol {
    String nome
    String nacionalidade
    Posicao posicao
    LocalDate dataNascimento
    double peso
    double altrura

    JogadorDeFutebol(String nome, Posicao posicao, LocalDate dataNascimento,String nacionalidade,  double peso,
                     double altrura) {
        this.nome = nome
        this.nacionalidade = nacionalidade
        this.posicao = posicao
        this.dataNascimento = dataNascimento
        this.peso = peso
        this.altrura = altrura
    }

    int getIdade() {
        int res = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now()) as int;
        return res
    }

    int getTempoParaAposentar() {
        int idadeParaAposentar
        switch (posicao){
            case Posicao.ATACANTE:
                if (getIdade() >= 35) {
                    return 0
                }
                idadeParaAposentar = 35 - getIdade()
                break
            case Posicao.DEFESA:
                if (getIdade() >= 40) {
                    return 0
                }
                idadeParaAposentar = 40 - getIdade()
                break
            case Posicao.MEIO_CAMPO:
                if (getIdade() >= 38) {
                    return 0
                }
                idadeParaAposentar = 38 - getIdade()
                break

        }
        return idadeParaAposentar

    }
    

    @Override
    String toString() {
        return "JogadorDeFutebol{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", peso=" + peso +
                ", altrura=" + altrura +
                '}';
    }
}
