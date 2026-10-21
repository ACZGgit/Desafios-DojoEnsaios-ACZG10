package ensaio3ListaDeExerciciosPOO.exercicio1


import spock.lang.Specification

import java.time.LocalDate

class JogadorDeFutebolTest extends Specification {

    static JogadorDeFutebol jogadorDeFutebol


    void setupSpec() {

        jogadorDeFutebol = new JogadorDeFutebol(
                "Gemisvaldo Pinto finissimo do Rego",
                Posicao.ATACANTE,
                LocalDate.of(1900, 02, 25),
                "brasileiro",
                1.20,
                120
        )

    }

    void "Deve calcular a idade do jogador | Base_750"() {
        given:
        int idadeEsperadaEmAnos = 126

        when:
        int idadeObtida = jogadorDeFutebol.getIdade()

        then:
        idadeEsperadaEmAnos == idadeObtida
    }


    void "Deve calcular o tempo para o jogador aposentar"() {
        given:
        int idadeDoJogador = 126
        int tempoParaAtacanteAposentar = 35
        int tempoEsperadoParaJogadorAposentar =tempoParaAtacanteAposentar - idadeDoJogador

        when:
        int tempoObtidoParaJogadorAposentar = jogadorDeFutebol.getTempoParaAposentar()

        then:
        tempoEsperadoParaJogadorAposentar == tempoObtidoParaJogadorAposentar
    }



}
