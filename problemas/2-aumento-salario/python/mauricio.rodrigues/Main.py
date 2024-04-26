print("--- Aumento de Salário 3LUZES ---")

salarioAtual = float(input("Digite o salário atual: "))

if 0 < salarioAtual <= 400.00:
    percentual = 0.15
    novoSalario = salarioAtual * (1 + percentual)
elif  400.00 < salarioAtual <= 800.00:
    percentual = 0.12
    novoSalario = salarioAtual * (1 + percentual)
elif  800.00 < salarioAtual <= 1200.00:
    percentual = 0.10
    novoSalario = salarioAtual * (1 + percentual)
elif  1200.00 < salarioAtual <= 2000.00:
    percentual = 0.07
    novoSalario = salarioAtual * (1 + percentual)
elif  salarioAtual > 2000:
    percentual = 0.04
    novoSalario = salarioAtual * (1 + percentual)

print("Você receberá: R$ {:.2f} ({:.2f}%)".format(novoSalario,  percentual * 100))