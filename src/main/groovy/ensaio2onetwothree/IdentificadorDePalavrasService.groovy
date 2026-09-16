package ensaio2onetwothree

class IdentificadorDePalavrasService {

    String execute(String entrada) {

        List<String> listaDePalavras = entrada.tokenize(',')
        // Lógica
        List<String> certo = ["one", "two", "three"]
        List<Integer> certoContagem = [0, 0, 0]

        List<String> resultado = []
        //listaDePalavras.remove(0)
        for (palavra in listaDePalavras) {
            int contadorIndex = 0

            //percorrendo caracteres
            for (c in palavra) {
                String tempLetra =certo[contadorIndex][0]
                if (c == certo[contadorIndex][0]) {
                    int indexContagem = listaDePalavras.indexOf(palavra)
                    certoContagem[indexContagem]++
                }
                contadorIndex++
            }
        }


        return resultado.join(",");
    }

}