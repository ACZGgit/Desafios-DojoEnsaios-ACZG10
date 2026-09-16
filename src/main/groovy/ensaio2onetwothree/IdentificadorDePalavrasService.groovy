package ensaio2onetwothree

class IdentificadorDePalavrasService {

    String execute(String entrada) {

        List<String> listaDePalavras = entrada.tokenize(',')
        // Lógica
        List<String> certo = ["one", "two", "three"]
        List<String> resultado

        for (palavra in listaDePalavras) {
            int countLetrasCorretas = 0
            for (c in palavra) {
                for (palavraCerta in certo) {
                    for (c2 in palavraCerta) {
                        if (c == c2) {
                            countLetrasCorretas++

                        }
                        if (countLetrasCorretas = palavraCerta.length() - 1) {
                            if (palavraCerta.equals("one")) {
                                
                            }
                        }

                    }
                }
            }
        }
    }



}