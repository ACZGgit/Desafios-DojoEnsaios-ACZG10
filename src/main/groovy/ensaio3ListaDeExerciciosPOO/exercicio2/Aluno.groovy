package ensaio3ListaDeExerciciosPOO.exercicio2

import groovy.transform.Canonical

@Canonical
class Aluno {

    String matricula
    String nome
    double notaProva1
    double notaProva2
    double notaTrabalho

    int getMedia(){
        int media = (int)(2.5*notaProva1+2.5*notaProva2+2*notaTrabalho)/7
        return media
    }
    int vaiPraProvaFinal(){
        if (getMedia()<6) {
            return 6 - getMedia()
        } else {
            return 0 // se passou
        }
    }
}
