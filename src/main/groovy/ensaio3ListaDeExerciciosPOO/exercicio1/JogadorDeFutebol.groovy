package ensaio3ListaDeExerciciosPOO.exercicio1

import java.time.LocalDate

class JogadorDeFutebol {
    String nome
    String nacionalidade
    Posicao posicao
    LocalDate dataNascimento
    double peso
    double altrura

    JogadorDeFutebol(String nome, Posicao posicao, LocalDate dataNascimento,String nacionalidade,  double peso,
                     double altrura) {
        this.nome = nome
        this.nacionalidade = nacionalidade
        this.posicao = posicao
        this.dataNascimento = dataNascimento
        this.peso = peso
        this.altrura = altrura
    }

    int getIdade() {
        def diferencaData =LocalDate.now().toEpochSecond()  - this.dataNascimento.toEpochSecond()
        return diferencaData.toDate().getYear()

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
