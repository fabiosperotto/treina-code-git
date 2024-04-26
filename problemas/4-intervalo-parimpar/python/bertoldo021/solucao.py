a = int(input("Digite o valor de a: "))
b = int(input("Digite o valor de b: "))

pares = 0
impares = 0

while True:
    num = int(input("Digite um número para verificar (ou 0 para sair): "))
    if num == 0:
        break
    if a <= num <= b:
        if num % 2 != 0:
           impares += 1
        else:
           pares += 1

print(f"Para o intervalo {a} <= x <= {b} existem {pares} números pares e {impares} números ímpares.")