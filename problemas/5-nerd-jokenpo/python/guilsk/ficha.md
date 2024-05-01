# Submissão de Solução

**Exercicio:** 5 - Nerd Jokenpo

**Nome:** guilsk | Guilherme Guglielmin Munhoz de Paula

**Comentários:** Resolvi desenvolver o problema de uma forma mais rebuscada. Utilizei enuns só porque gosto da ideia de utilizá-los, apesar disso ter causado uma coluna de ifs e elses que poderiam ter facilmente sido implementado de outra forma. 
O problema foi resolvido pensando nos seguintes passos:
1. O jogo deve começar de alguma forma
 - Organizar os prints e inputs é a parte mais demorada mas a mais importante, já que é quando o jogo começa que você prende o jogador.
2. Os cálculos do jogo não devem ser feitos dentro da main
 - Para isso foram utilizadas funções para deixar a main mais limpa. //TODO seria interessante separar essas funções em classes no futuro
3. O jogo tem que ser divertido
 - Se o jogador não quiser jogar ou responder algo errado ele que não jogue. Sendo assim ações inválidas representam um fim de jogo

Um comentário final sobre este problema? Acredito que seria interessante programar um bot utilizando a biblioteca random.py para jogarmos contra um oponente mais desafiador do que nós mesmos.

**Como rodar a solução**: Abra esta pasta no seu terminal

- Use o comando abaixo: 
```bash
python nerd_jokenpo_guilsk.py
```
- Se estiver na pasta "treina-code-git" utilize este comando para se direcionar para esta pasta:
```bash
cd problemas/5-nerd-jokenpo/python/guilsk
```