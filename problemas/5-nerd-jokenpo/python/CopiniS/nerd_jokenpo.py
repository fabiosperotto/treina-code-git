quantidade_partidas = int(input('Digite a quantidade de partidas que serão jogadas: '))
pontosJogador1 = 0
pontosJogador2 = 0
#as chaves são as opções de jogadas, e os valores são as listas de opções de jogadas que perdem pra suas respectivas chaves
#Ex: pedra ganha da tesoura e do lagarto
escolhas_possiveis = {
    'pedra': ['tesoura', 'lagarto'],
    'papel': ['pedra', 'spok'],
    'tesoura': ['papel', 'lagarto'],
    'lagarto': ['spok', 'papel'],
    'spok': ['tesoura', 'pedra']
}

print('Escolha uma dessas opções de jogada para cada jogador: \n'
'pedra \n'
'papel \n'
'tesoura \n'
'lagarto \n'
'spok \n')
i = 0
while(i < quantidade_partidas):
    print('Partida '+ str(i+1))
    escolhaJogador1 = input('Digite a jogada do jogador 1: ').lower()
    if escolhaJogador1 not in escolhas_possiveis:
        print('Jogada inválida')
        continue
    escolhaJogador2 = input('Digite a jogada do jogador 2: ').lower()
    if escolhaJogador2 not in escolhas_possiveis:
        print('Jogada inválida')
        continue
    if escolhaJogador1 == escolhaJogador2:
        print('Empate')
    elif escolhaJogador2 in escolhas_possiveis[escolhaJogador1]:
        print('Ponto para o jogador 1')
        pontosJogador1 += 1
    elif escolhaJogador1 in escolhas_possiveis[escolhaJogador2]:
        print('Ponto para o jogador 2')
        pontosJogador2 += 1
    i += 1
print('\nRESULTADO DO JOGO:')
if(pontosJogador1 == pontosJogador2):
    print('O JOGO TERMINOU EMPATADO')
elif(pontosJogador1 > pontosJogador2):
    print('O JOGADOR 1 GANHOU')
else:
    print('O JOGADOR 2 GANHOU')


    