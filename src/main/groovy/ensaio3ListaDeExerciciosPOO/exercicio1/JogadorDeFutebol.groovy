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

//        def diferencaData =LocalDate.now().toEpochSecond()  - this.dataNascimento.toEpochSecond()
//        return diferencaData.toDate().getYear()

    }

    int getTempoParaAposentar() {
        switch (posicao){
            case Posicao.ATACANTE:
                break
            case Posicao.DEFESA:
                break
            case Posicao.MEIO_CAMPO:
                break

        }

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
