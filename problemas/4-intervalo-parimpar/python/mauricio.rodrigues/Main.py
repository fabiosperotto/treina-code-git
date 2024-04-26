a = int(input("Informe um número base para o intervalo: "))
b = int(input("Informe um número limite para o intervalo: "))

pares = 0
impares = 0

while True:
    n = int(input("Digite um número (0 para sair): "))
    if n == 0:
        break
    if a <= n <= b:
        if n % 2 == 0:
            pares += 1
        else:
            impares += 1

print(f"Para o intervalo {a} e <= {b} existem {pares} números pares e {impares} números ímpares.")
