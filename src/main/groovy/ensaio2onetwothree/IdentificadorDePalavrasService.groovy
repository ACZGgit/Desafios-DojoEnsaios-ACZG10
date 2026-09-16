package ensaio2onetwothree

class IdentificadorDePalavrasService {

    String execute(String entrada) {

        List<String> listaDePalavras = entrada.tokenize(',')
        // Lógica
        List<String> certo = ["one", "two", "three"]
        List<Integer> certoContagem = [0, 0, 0]

        List<String> resultado = []
        listaDePalavras.remove(0)
        for (palavra in listaDePalavras) {
            int countLetrasCorretas = 0
            int contadorIndex = 0

            //percorrendo caracteres
            for (c in palavra) {
                if (c==palavra(contadorIndex))
                    countLetrasCorretas++
                    int indexContagem = listaDePalavras.indexOf(palavra)
                    certoContagem[indexContagem] =certoContagem(indexContagem)+1;
            }
        }


        return resultado.join(",");
    }


}