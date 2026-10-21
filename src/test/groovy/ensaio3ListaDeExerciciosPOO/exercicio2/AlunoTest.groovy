package ensaio3ListaDeExerciciosPOO.exercicio2

import org.junit.jupiter.api.Test
import spock.lang.Specification

class AlunoTest extends Specification{

    static Aluno aluno


    void setupSpec(){
        aluno = new Aluno(
                "202410",
                "Sandubinha",
                9,
                9,
                9
        )

    }

    void "valida solucao base | Base_750"(){

        given:
            int mediaEsperada = 9
            int notaEsperada = 0

        when:
            int mediaObtida = aluno.getMedia()
            int notaObtida = aluno.vaiPraProvaFinal()

        then:
            mediaEsperada == mediaObtida
        and:
            notaEsperada == notaObtida

    }



    void "calcula media do aluno"() {

        given:
            int mediaEsperada = 9

        when:
            int mediaObtida = aluno.getMedia()

        then:
            mediaEsperada == mediaObtida
    }

    @Test
    void "valida se o aluno vai pra prova final"() {
        given:
            int notaEsperada = 0

        when:
            int notaObtida = aluno.vaiPraProvaFinal()

        then:
            notaEsperada == notaObtida
    }

}
