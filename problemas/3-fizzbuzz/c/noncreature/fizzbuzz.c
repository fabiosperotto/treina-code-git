#include <stdio.h>
int main(void){
    printf("Digite um número inteiro: ");
    int n;
    scanf("%d",&n);
    printf("\n");
    for(int i = 1; i <= n; i++){
        int r3 = i%3, r5 = i%5;
        if(r3==0) printf("Fizz");
        if(r5==0) printf("Buzz");
        if(r3!=0 && r5!=0) printf("%d",i);
        printf("\n");
    }
    scanf("");
}