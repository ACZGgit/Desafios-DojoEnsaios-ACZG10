package ensaio2onetwothree

class IdentificadorDePalavrasService {

    String execute(String entrada) {

        List<String> listaDePalavras = entrada.tokenize(',')
        // Lógica
        List<String> certo = ["one", "two", "three"]
        for (String palavras : listaDePalavras) {
            int countLetrasCorretas = 0
            for (String caracter : palavras) {
                for (String palavraCerta : certo) {
                    for (String caracterCerto : palavraCerta) {
                        if (caracter.equals(caracterCerto)){
                            countLetrasCorretas++
                            if(countLetrasCorretas == palavraCerta.size()-1){

                            }
                        }
                    }
                }
            }
        }


        return listaDePalavras
    }

}