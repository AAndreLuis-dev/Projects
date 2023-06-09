#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main()
{
    //qtd de letras
    char nome[50][50]; //<- n° posições do vet
    char end[50][50];
    char cpf[50][50];

    int i;

    setlocale(LC_ALL, "Portuguese");

    for (i = 0; i <= 2; i++)
    {
        system("clear");
        printf("Digite seu nome: \t");
        gets(nome[i]);
        fflush(stdin);
        printf("Digite seu endereço: \t");
        gets(end[i]);
        fflush(stdin);
        printf("Digite seu CPF: \t");
        gets(cpf[i]);
        fflush(stdin);
    }

    for (i = 0; i <= 2; i++)
    {

        printf("\n------------------------\n");
        printf("\nNome: %s\t", nome[i]);
        fflush(stdin);
        printf("\nendereço: %s\t", end[i]);
        fflush(stdin);
        printf("\nnome: %s\t", cpf[i]);
        fflush(stdin);
    }
}