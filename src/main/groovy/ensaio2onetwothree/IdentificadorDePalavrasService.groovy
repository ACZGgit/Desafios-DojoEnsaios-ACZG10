package ensaio2onetwothree

class IdentificadorDePalavrasService {

    String execute(String entrada) {

        List<String> listaDePalavras = entrada.tokenize(',')
        // Lógica
        List<String> certo = ["one", "two", "three"]
        List<Integer> certoContagem = [0, 0, 0]

        String resultado = ""
        //listaDePalavras.remove(0)
        listaDePalavras.remove(0)
        int numeroFinal
        for (palavra in listaDePalavras) {
            int contadorIndex = 0
            certoContagem = [0, 0, 0]

            //percorrendo caracteres
            for (c in palavra) {
                if (c == certo[contadorIndex][0]) {
                    int indexContagem = listaDePalavras.indexOf(palavra)
                    certoContagem[indexContagem]++
                }

                contadorIndex++
            }
            int valorMaximo = certoContagem.max()
            int indiceValorMaximo = certoContagem.indexOf(valorMaximo)
            numeroFinal =  convertePalavraEmNumero(certo[indiceValorMaximo])
            resultado+="${numeroFinal}"
        }
        return resultado.join(",")
    }

    int convertePalavraEmNumero(String palavra) {
        switch (palavra) {
            case "one":
                return 1
                break
            case "two":
                return 2
                break
            case "three":
                return 3
                break
            default:
                break
        }
    }

}