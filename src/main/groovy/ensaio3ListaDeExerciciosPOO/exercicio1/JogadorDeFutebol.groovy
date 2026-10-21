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

    JogadorDeFutebol(String nome, Posicao posicao, LocalDate dataNascimento, String nacionalidade, double peso,
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
        int idadeEsperadaParaAposentar
        switch (posicao) {
            case Posicao.ATACANTE:
                idadeEsperadaParaAposentar = 35
                idadeParaAposentar = idadeEsperadaParaAposentar - getIdade()
                break
            case Posicao.DEFESA:
                idadeEsperadaParaAposentar = 40
                idadeParaAposentar = idadeEsperadaParaAposentar - getIdade()
                break
            case Posicao.MEIO_CAMPO:
                idadeEsperadaParaAposentar = 38
                idadeParaAposentar = idadeEsperadaParaAposentar - getIdade()
                break

        }
        return idadeParaAposentar

    }


    @Override
    String toString() {
        return "JogadorDeFutebol{" +
               "nome='" +
               nome +
               '\'' +
               ", posicao='" +
               posicao +
               '\'' +
               ", dataNascimento=" +
               dataNascimento +
               ", peso=" +
               peso +
               ", altrura=" +
               altrura +
               '}';
    }
}
