# Problema 5 - Nerd Jokenpô

O Nerd Jokenpô é uma expansão do jogo pedra, papel e tesoura. O mecanismo dos jogos são iguais, porém aqui existem novas possibilidades de ações: o lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock". As regras são as seguintes:

- Tesoura corta papel
- Papel cobre pedra
- Pedra derruba lagarto
- Lagarto adormece Spock
- Spock derrete tesoura
- Tesoura prende lagarto
- Lagarto come papel
- Papel refuta Spock
- Spock vaporiza pedra
- Pedra quebra tesoura


Sam e Karen estão disputando um rodada de 3 partidas para definir quem ganhou. Então crie um algoritmo que lista o resultado de cada partida.


Entrada: o programam deverá receber múltiplas linhas de entrada. Sendo que a primeira linha será um número inteiro que define quantas partidas serão realizadas. Em seguida, as próximas linhas serão compostas pela ação de Sam e da Karen, respectivamente.

Saída: na saída são esperadas os mesmos números de linhas, definidas pela quantidade de partidas inicialmente. Neste caso, cada linha deve exibir o resultado das ações do jogo. Se em uma linha for fornecido "spock spock" na saída na linha correspondente deverá ser "empate", por exemplo.



Entrada Exemplo:
```sh
3
spock spock
tesoura spock
lagarto spock
```


Saída Exemplo:

```sh
empate
karen
sam
```
