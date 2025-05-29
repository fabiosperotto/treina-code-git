print("Digite o seu salário atual:")
salario = float(input())

if salario <= 400.00: 
    percentual = 15
elif salario <= 800.00:
    percentual = 12
elif salario <= 1200.00:
    percentual = 10
elif salario <= 2000.00:
    percentual = 7 
else:
    percentual = 4

aumento = salario * (percentual / 100)
novo_salario = salario + aumento

print(f"Você receberá: R$ {novo_salario:.2f} ({percentual}%)")
print (f"O aumento foi de: R$ {aumento:.2f}")