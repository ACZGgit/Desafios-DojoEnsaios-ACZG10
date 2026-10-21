package ensaio3ListaDeExerciciosPOO.exercicio1

import java.time.LocalDate

class JogadorDeFutebol {
    String nome
    Posicao posicao
    LocalDate dataNascimento
    double peso
    double altrura

    JogadorDeFutebol(String nome, String posicao, LocalDate dataNascimento, double peso, double altrura) {
        this.nome = nome
        this.posicao = posicao
        this.dataNascimento = dataNascimento
        this.peso = peso
        this.altrura = altrura
    }

    int getIdade() {
        return (LocalDate.now().minusYears(dataNascimento).year)
    }

//    int getTempoParaAposentar() {}
    

    @Override
    String toString() {
        return "JogadorDeFutebol{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", peso=" + peso +
                ", altrura=" + altrura +
                '}';
    }
}
