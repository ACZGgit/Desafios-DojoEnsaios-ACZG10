package ensaio3ListaDeExerciciosPOO.exercicio3

import ensaio3ListaDeExerciciosPOO.exercicio1.JogadorDeFutebol
import ensaio3ListaDeExerciciosPOO.exercicio1.Posicao
import spock.lang.Shared
import spock.lang.Specification

import java.time.LocalDate

class GabaritoTest extends Specification {

    static Gabarito gabarito

    void setupSpec() {
        Map<Integer, Character> valores = [1: 'A', 2: 'B', 3: 'C']
        gabarito = new Gabarito(valores)
    }


    def "metodo respostaquestao retorna valor correto"(Integer numero) {
        expect:
        gabarito.respotaQuestao(numero) == resposta

        where:
        numero | resposta
        1      | 'A'
        2      | 'B'
        3      | 'C'

    }


}
