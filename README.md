# Ensaios-Dojos-ACZG

**Título do problema:** Será divulgado durante o Dojo

Os enunciados serão divulgados durante os ensaios:

- Ensaio 1: Para acessar o enunciado [clique aqui](https://docs.google.com/document/d/1_G9zLJJjszyBNKQG8kcjqlOkFrcNcvMBNBOuUbMtY4E/edit)
- Ensaio 2: Para acessar o enunciado [clique aqui](https://docs.google.com/document/d/1Q_M_JGL25Xu93_c4VwQP2BPo1oQApDMSAHkl1iuz1vQ/edit)
- Ensaio 3: Para acessar o enunciado [clique aqui](https://docs.google.com/document/d/1Bjleo7JUU7UgWdcrqaSyqggH9A2WOJgJMC9QikYK5lk/edit)


**O Dojo terá início às HH:MM hrs do dia dd/mm/aaaa (N-feira)**


Os componentes dos grupos são os seguintes, já na ordem de rotacionamento:
- L


Recapitulando, o Dojo funciona baseado em rotatividade, onde a cada rodada 2 participantes interagem, sendo que 1 estará
compartilhando a tela e codificando e o outro auxiliando verbalmente, os que estiverem fora da rodada observam em silêncio

**Regras do Dojo:**
- **NÃO** é permitido:
  - Consulta ao Stack overflow
  - Consulta no google quanto a solução
  - Consulta no ChatGPT ou semelhantes
  - Consulta a seres de outro plano existencial
  - Magia, Jutsu, jujutsu, Ki, Haki, Akuma no Mi, Stand, Alquimia, Titã Fundador ou qualquer técnica sobrehumana
- É permitido:
  - Consulta a documentação
  - Rezar por sua alma


**Ferramentas e tecnologias:**
- InteliJ IDEA
- Groovy
- Spock/Junit
- [Excalidraw](https://excalidraw.com/)



**GitActionZimBot:**

Durante o Dojo, teremos a ajuda do nosso camarada ActZimBot, na contabilização de pontos:

<img src="./src/main/resources/26350515.png" width="200">


Para demarcar o termino de requisitos, é necessário realizar commits com o seguinte padrão de comentários:
- Indicar termino do requisito base
  - > feat [Base]: requisito base terminado
- Indicar termino de requisito extra
  - > feat [ExtraN]: requisito Extra N terminado

Nos demais commits utilize commit semântico, sem adicionar os ReqID


Para que o ActZim contabilize os pontos corretamente, deve ser adicionado ao nome do teste unitário que comprova o requisito o pattern "| ReqID_pontos"
```
void "nome do teste | ReqID_Points"()

Por exemplo:

void "comando1Test | Base_750"()
void "comandoExtra1Test | Extra1_100"()
```

**Atenção:**
- Escreva **corretamente** o **| ReqID_Pontos**, se não o **ActZim** não irá realizar a contagem
- O teste que recebe o ReqID de um requisito deve ser unico. Se for um teste com bloco where e vários cases não irá funcionar
- Não use o ReqID em outros commits/testes que não correspondam aos indicados

### Instruções iniciais
- Clone esse repositório utilizando o terminal ou o InteliJ (git clone)
- Abra o projeto com o InteliJ (muita atenção para abrir a pasta do projeto e não alguma acima dela, lembrando que tudo no Dojo é feito via InteliJ)
- No InteliJ, faça um **pull com rebase**
- Em seguida, abra o arquivo "Participantes.txt" e insira um **OK** na frente do seu nome
- Utilize o InteliJ para realizar o commit e push na master dessa alteração
- Para evitar conflitos, não faça mais nenhuma alteração no projeto até o início do Dojo
- Lembre-se sempre, antes de qualquer alteração no Dojo, fazer um **pull com rebase**
****