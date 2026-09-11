package ensaio1Calculadora.services
import spock.lang.Specification

class CalculadoraCientificaServiceTest extends Specification {

    static CalculadoraCientificaService calculadoraCientificaService

    void setupSpec(){
        calculadoraCientificaService = new CalculadoraCientificaService()
    }


    void "testando operacoes do requisito base | Base_750"() {

        given:
            int valor1 = 2
            int valor2 = 2
            int valor3 = 4
            int valor4 = 100
            int valor5 = 90
            int valor6 = 45

            double resultadoEsperadoSum         = 4
            double resultadoEsperadoSub         = 0
            double resultadoEsperadoMul         = 4
            double resultadoEsperadoDiv         = 1
            double resultadoEsperadoRaiz        = 2
            double resultadoEsperadoPot         = 4
            double resultadoEsperadoPorcentagem = 2
            double resultadoEsperadoLog         = 2
            double resultadoEsperadoSeno        = 1
            double resultadoEsperadoCosseno     = 0
            double resultadoEsperadoTangente    = 1

        when:
            double resultadoObtidoSum         = calculadoraCientificaService.sum        (valor1, valor2)
            double resultadoObtidoSub         = calculadoraCientificaService.sub        (valor1, valor2)
            double resultadoObtidoMult        = calculadoraCientificaService.mult       (valor1, valor2)
            double resultadoObtidoDiv         = calculadoraCientificaService.div        (valor1, valor2)
            double resultadoObtidoRaiz        = calculadoraCientificaService.raiz       (valor3)
            double resultadoObtidoPot         = calculadoraCientificaService.pot        (valor1, valor2)
            double resultadoObtidoPorcentagem = calculadoraCientificaService.porcentagem(valor4, valor2)
            double resultadoObtidoLog         = calculadoraCientificaService.log        (valor4)
            double resultadoObtidoSeno        = calculadoraCientificaService.seno       (valor5)
            double resultadoObtidoCos         = calculadoraCientificaService.cos        (valor5)
            double resultadoObtidoTan         = calculadoraCientificaService.tan        (valor6)

            double ultimoResultado            = calculadoraCientificaService.getLastResult()

        then:
            resultadoEsperadoSum          == resultadoObtidoSum
            resultadoEsperadoSub          == resultadoObtidoSub
            resultadoEsperadoMul          == resultadoObtidoMult
            resultadoEsperadoDiv          == resultadoObtidoDiv
            resultadoEsperadoRaiz         == resultadoObtidoRaiz
            resultadoEsperadoPot          == resultadoObtidoPot
            resultadoEsperadoPorcentagem  == resultadoObtidoPorcentagem
            resultadoEsperadoLog          == resultadoObtidoLog
            resultadoEsperadoSeno         == resultadoObtidoSeno
            resultadoEsperadoCosseno      == resultadoObtidoCos
            resultadoEsperadoTangente     == resultadoObtidoTan

            ultimoResultado              == resultadoEsperadoDiv
    }


    void "Testa registro do ultimo resultado"() {

    }

    void "CleanLastResult"() {

    }

    void "Soma de dois valores (#x,#y)"() {
        expect:
            calculadoraCientificaService.sum(x,y) == resultado

        where:
            x   | y  | resultado
            1   | 1  | 2
            3   | 5  | 8
            100 | 20 | 120
            10  | 10 | 20

    }

    void "Subtração de dois valores (#x,#y)"() {
        expect:
        calculadoraCientificaService.sub(x,y) == resultado

        where:
        x   | y  | resultado
        1   | 1  | 0
        3   | 5  | -2
        100 | 20 | 80
        10  | 10 | 0
    }

}
