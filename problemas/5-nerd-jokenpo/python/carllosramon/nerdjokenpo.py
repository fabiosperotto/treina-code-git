def main():
    rounds = get_number_of_rounds()

    for i in range(rounds):
        # Obtendo as ações de Sam e Karen para a rodada atual
        actions = get_actions(i + 1)
        # Determinando o vencedor da rodada e imprimindo o resultado
        result = determine_winner(actions[0], actions[1])
        print(result)

# Função para obter o número de rodadas a serem jogadas
def get_number_of_rounds():
    print("Digite o número de rodadas:")
    return int(input())

# Função para obter as ações de Sam e Karen para uma rodada específica
def get_actions(round_number):
    print(f"Rodada {round_number}: Digite a ação de Sam e Karen (ex: pedra papel):")
    sam_action, karen_action = input().lower().split()
    
    # Validar ações
    if not is_valid_action(sam_action) or not is_valid_action(karen_action):
        print("Ação inválida. Por favor, digite novamente.")
        return get_actions(round_number)

    return sam_action, karen_action

# Função para validar se uma ação é válida
def is_valid_action(action):
    valid_actions = ["tesoura", "papel", "pedra", "lagarto", "spock"]
    return action in valid_actions

# Função para determinar o vencedor de uma rodada
def determine_winner(sam_action, karen_action):
    # Verificar se houve empate
    if sam_action == karen_action:
        return "empate"

    # Determinar o vencedor com base nas regras do jogo
    if sam_action == "tesoura":
        return "sam" if karen_action in ["papel", "lagarto"] else "karen"
    elif sam_action == "papel":
        return "sam" if karen_action in ["pedra", "spock"] else "karen"
    elif sam_action == "pedra":
        return "sam" if karen_action in ["lagarto", "tesoura"] else "karen"
    elif sam_action == "lagarto":
        return "sam" if karen_action in ["spock", "papel"] else "karen"
    elif sam_action == "spock":
        return "sam" if karen_action in ["tesoura", "pedra"] else "karen"
    else:
        return "entrada inválida"

if __name__ == "__main__":
    main()