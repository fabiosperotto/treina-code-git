# Ficha de solução

## Problema
4 - Intervalo, Par e Impar

## Linguagem
Kotlin

## Autor
JuliaBolting

## Descrição
Programa que recebe dois números inteiros para definir um intervalo, depois lê números até 0, contando quantos estão no intervalo e são pares ou ímpares.

## Pré-requisito
Deve ter kotlinc (compilador do kotlin) instalado.
Instalação: 
1 -Acesse https://github.com/JetBrains/kotlin/releases (busque por “kotlin-compiler-... .zip”)
2 - Extraia o arquivo 
3 - Adicione o caminho no Path das Variáveis de Ambiente
4 - Teste se deu certo no bash com kotlinc -version

## Como rodar
Compilar e executar com:
```bash  (vá até a pasta que está o arquivo solucao.kt)
kotlinc solucao.kt -include-runtime -d solucao.jar
java -jar solucao.jar