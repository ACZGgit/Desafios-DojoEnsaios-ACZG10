package ensaio2onetwothree


import spock.lang.Specification

class IdentificadorDePalavrasServiceTest extends Specification {

    static IdentificadorDePalavrasService identificadorService;


    void setupSpec(){
        identificadorService = new IdentificadorDePalavrasService();

    }

    void "testando entrada 1 | Base_750"(){
        given:
            String palavrasDeEntrada = "3,owe,too,theee";
            String saidaEsperada = "1,2,3";

        when:
            String resultadoObtido = identificadorService.execute(palavrasDeEntrada);

        then:
            saidaEsperada == resultadoObtido
    }

    void "testando outros cases"(){
        expect:
        identificadorService.execute(palavrasDeEntrada) == saidaEsperada

        where:
        palavrasDeEntrada         | saidaEsperada
        "5,wwo,oni,threi,tww,tho" | "2,1,3,2,2"
        "3,nne,thpee,owo"         | "1,3,2"
    }

}
