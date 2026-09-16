package ensaio2onetwothree

class IdentificadorDePalavrasService {

    String execute(String entrada) {

        List<String> listaDePalavras = entrada.tokenize(',')
        // Lógica
        List<String> certo = ["one", "two", "three"]
        int[] certoContagem = int[2] // [0, 0, 0]

        List<String> resultado = []
        listaDePalavras.remove(0)
        for (palavra in listaDePalavras) {
            int contadorIndex = 0

            //percorrendo caracteres
            for (c in palavra) {
                if (c == palavra(contadorIndex)) {
                    int indexContagem = listaDePalavras.indexOf(palavra)
                    certoContagem[indexContagem]++
                }
            }
            contadorIndex++
        }


        return resultado.join(",");
    }

}