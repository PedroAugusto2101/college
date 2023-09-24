/* Faça um Programa que leia um vetor de 5 números inteiros,
mostre a soma e a multiplicação por 4 de cada número. */
#include <stdio.h>
#include <locale.h>
int main() 
{
    setlocale(LC_ALL, "Portuguese");
    
    int i, n_int[5];
    
    for (i=0; i<5; i++) {
    printf("Digite um número: ");
    scanf("%d", &n_int[i]);
}
for (i=0; i<5; i++) {
printf("\n\nA soma por 4 do %dº número: %d", i+1, n_int[i]+4);
printf("\nA multipllicação por 4 do %dº número: %d", i+1, n_int[i]*4);
}
}
