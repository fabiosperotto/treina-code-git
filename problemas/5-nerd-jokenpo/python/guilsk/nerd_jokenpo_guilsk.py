from enum import Enum

class Jokenpo(Enum):
  NotPlaying = 0
  Pedra = 1
  Papel = 2
  Tesoura = 3
  Lagarto = 4
  Spock = 5

def printGameStart():
  print("Muito bem!\nPara jogar você deve escolher uma dessas opções:")
  print("1 - Pedra")
  print("2 - Papel")
  print("3 - Tesoura")
  print("4 - Lagarto")
  print("5 - Spock")

def setPlayChoice(answer: str):
  if(answer == "1" or answer.lower() == "pedra"): return Jokenpo.Pedra
  elif(answer == "2" or answer.lower() == "papel"): return Jokenpo.Papel
  elif(answer == "3" or answer.lower() == "tesoura"): return Jokenpo.Tesoura
  elif(answer == "4" or answer.lower() == "lagarto"): return Jokenpo.Lagarto
  elif(answer == "5" or answer.lower() == "spock"): return Jokenpo.Spock
  else: return Jokenpo.NotPlaying

def calcPlay(sam, karen):
  if(sam == Jokenpo.Pedra):
    if(karen == Jokenpo.Pedra): return "Empate"
    elif(karen == Jokenpo.Papel or karen == Jokenpo.Spock): return "Karen Bryla"
    elif(karen == Jokenpo.Lagarto or karen == Jokenpo.Tesoura): return "Sam Kass"
  elif(sam == Jokenpo.Papel):
    if(karen == Jokenpo.Papel): return "Empate"
    elif(karen == Jokenpo.Tesoura or karen == Jokenpo.Lagarto): return "Karen Bryla"
    elif(karen == Jokenpo.Pedra or karen == Jokenpo.Spock): return "Sam Kass"
  elif(sam == Jokenpo.Tesoura):
    if(karen == Jokenpo.Tesoura): return "Empate"
    elif(karen == Jokenpo.Pedra or karen == Jokenpo.Spock): return "Karen Bryla"
    elif(karen == Jokenpo.Papel or karen == Jokenpo.Lagarto): return "Sam Kass"
  elif(sam == Jokenpo.Lagarto):
    if(karen == Jokenpo.Lagarto): return "Empate"
    elif(karen == Jokenpo.Pedra or karen == Jokenpo.Tesoura): return "Karen Bryla"
    elif(karen == Jokenpo.Papel or karen == Jokenpo.Spock): return "Sam Kass"
  elif(sam == Jokenpo.Spock):
    if(karen == Jokenpo.Spock): return "Empate"
    elif(karen == Jokenpo.Lagarto or karen == Jokenpo.Papel): return "Karen Bryla"
    elif(karen == Jokenpo.Pedra or karen == Jokenpo.Tesoura): return "Sam Kass"
  else: return "Não quer jogar corretamente? Tudo bem..."

sam = Jokenpo.NotPlaying
karen = Jokenpo.NotPlaying
isGameOn = True

rounds = int(input("Digite quantas vezes você quer jogar: "))
printGameStart()
while(isGameOn):
  answer = input("\nDigite a jogada de Sam Kass: ")
  sam = setPlayChoice(answer)
  answer = input("\nDigite a jogada de Karen Bryla: ")
  karen = setPlayChoice(answer)
  print("\n",calcPlay(sam, karen))

  rounds -= 1
  if(rounds == 0 or sam == Jokenpo.NotPlaying or karen == Jokenpo.NotPlaying): 
    isGameOn = False
    print("\nFim de Jogo!") 
    


