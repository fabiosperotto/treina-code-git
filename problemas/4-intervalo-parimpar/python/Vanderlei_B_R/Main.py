a = int(input("Digite o primeiro número: "))
b = int(input("Digite o segundo número: "))
pares = 0
impares = 0

while True:
    num = int(input("Digite um número (0 para sair): "))
    if num == 0:
        break
    elif a <= num <= b:
        if num % 2 == 0:
            pares += 1
        else:
            impares += 1

print(f"Para o intervalo {a} <= a <= {b} existem {pares} núm