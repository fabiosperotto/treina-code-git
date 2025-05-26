print("Digite seu salario")
salario = float(input())


if(salario > 0 and salario <= 400):
    salario = salario + salario*0.15
    porcentagem = "15"
elif(salario > 400 and salario <= 800):
    salario = salario + salario*0.12
    porcentagem = "12"
elif(salario > 800 and salario <= 1200):
    salario = salario + salario*0.10
    porcentagem = "10"
elif(salario > 1200 and salario <= 2000):
    salario = salario + salario*0.07
    porcentagem = "7"
elif(salario > 2000):
    salario = salario + salario*0.04
    porcentagem = "4"

print(f"Você receberá: R$ {salario:.2f} ({porcentagem}%) onde X é o novo salário e Y é o percentual da tabela que foi aplicado no reajuste.")