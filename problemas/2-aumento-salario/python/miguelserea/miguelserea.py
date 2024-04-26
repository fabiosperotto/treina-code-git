n = float(input("Por favor, digite seu salário: ")) 

def aumento(salario):  
    if salario < 400.01:
        return salario * (15 / 100)  
    elif salario >= 400.01 and salario < 800.01:
        return salario * (12 / 100)  
    elif salario >= 800.01 and salario < 1200.01:
        return salario * (10 / 100) 
    elif salario >= 1200.01 and salario < 2000.01:
        return salario * (7 / 100)
    elif salario >= 2000.01:
        return salario * (4 / 100)  

aumento_salarial = aumento(n)  
total = n + aumento_salarial 

print("Seu reajuste foi de", aumento_salarial, "seu salário após o reajuste é de", total) 