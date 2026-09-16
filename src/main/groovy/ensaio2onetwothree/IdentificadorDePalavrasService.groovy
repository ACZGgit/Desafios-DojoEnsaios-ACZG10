package ensaio2onetwothree

class IdentificadorDePalavrasService {

    String execute(String entrada) {

        List<String> listaDePalavras = entrada.tokenize(',')
        // Lógica
        List<String> certo = ["one", "two", "three"]
        List<String> resultado = []
        listaDePalavras.remove(0)
        for (palavra in listaDePalavras) {
            int countLetrasCorretas = 0
            for (c in listaDePalavras) {
                int contadorIndex =0
                for (palavraCerta in certo) {

                    if(c == palavraCerta(contadorIndex))
                        countLetrasCorretas++

                    if (countLetrasCorretas = palavraCerta.length() - 1) {
                        if (palavraCerta.equals("one")) {
                            resultado << "1"
                        }
                        if (palavraCerta.equals("two")) {
                            resultado << "2"
                        }
                        if (palavraCerta.equals("three")) {
                            resultado << "3"
                        }
                    }


                }
            }
        }
        return resultado.join(",");
    }


}