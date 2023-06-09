#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main()
{
    //qtd de letras
    char nome[10][10]; //<- n° posições do vet
    int i;
    setlocale(LC_ALL, "Portuguese");

    for (i = 0; i <= 2; i++)
    {
        printf("Digite seu nome: \n");
        scanf("%s", &nome[i]);
        fflush(stdin);
    }

    for (i = 0; i <= 2; i++)
    {
        printf("%i° Nome: %s\n", i + 1, nome[i]);
        fflush(stdin);
    }
}