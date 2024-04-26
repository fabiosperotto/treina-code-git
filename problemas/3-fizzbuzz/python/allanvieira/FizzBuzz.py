# lê um número inteiro da entrada
x = int(input("Digite um número inteiro: "))

# itera de 1 a x
for i in range(1, x+1):
    # verifica se i é divisível por 3 e 5
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    # verifica se i é divisível por 3
    elif i % 3 == 0:
        print("Fizz")
    # verifica se i é divisível por 5
    elif i % 5 == 0:
        print("Buzz")
    # se i não é divisível por nenhum dos números, imprime i
    else:
        print(i)
