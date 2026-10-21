package ensaio3ListaDeExerciciosPOO.exercicio3

import spock.lang.Specification

class ProvaTest extends Specification{
    static Gabarito gabarito
    static Prova prova

    void setupSpec() {
        Map<Integer, Character> valores = [1: 'A', 2: 'B', 3: 'C']
        prova = new Prova(new Gabarito(valores))
    }

    def "deve calcular os acertos"() {
        expect:
        prova.respostaAluno(respostaAluno) == resposta

        where:
        respostaAluno | resposta
        1             | 'A'
        2             | 'B'
        3             | 'C'
    }

}
