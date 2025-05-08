def main():
    salario = float(input("Digite o salário do funcionário: "))
    
    percentual_de_reajuste = 100
    if salario <= 400:
        percentual_de_reajuste += 15
    elif salario <= 800:
        percentual_de_reajuste += 12
    elif salario <= 1200:
        percentual_de_reajuste += 10
    elif salario <= 2000:
        percentual_de_reajuste += 7
    elif salario > 2000:
        percentual_de_reajuste += 4
    
    salario_reajustado = (salario * percentual_de_reajuste) / 100
    print(f'Você receberá: R$ {salario_reajustado: .2f} ({percentual_de_reajuste - 100}%)')
        
if __name__ == "__main__":
    while True:
        main()