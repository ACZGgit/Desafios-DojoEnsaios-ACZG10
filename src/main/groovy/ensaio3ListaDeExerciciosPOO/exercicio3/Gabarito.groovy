package ensaio3ListaDeExerciciosPOO.exercicio3

import groovy.transform.TupleConstructor

@TupleConstructor
class Gabarito {
    Map<Integer, Character> gabarito


    char respostaQuestao(Integer numeroQuestao){
        if (!gabarito.containsKey(numeroQuestao)) throw new Exception("Argumento invalido, essa questao nao existe no gabarito.")

        gabarito.get(numeroQuestao)
    }
}
