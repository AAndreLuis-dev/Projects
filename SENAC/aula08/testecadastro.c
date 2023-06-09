#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

main()
{

    char nome[50][50];
    char cpf[50][50];
    char tel[50][50];

    int i;
    int loop;

    setlocale(LC_ALL, "Portuguese");

    printf("Quantos cadastros você deseja realizar? \t");
    scanf("%i", &loop);
    fflush(stdin);
    for (i = 1; i <= loop; i++)
    {
        system("clear");
        fflush(stdin);
        printf("\nDigite seu nome: \t \n");
        scanf("%s", &nome[i]);
        fflush(stdin);
        printf("Digite seu cpf: \t \n");
        gets(cpf[i]);
        fflush(stdin);
        printf("\nDigite seu número: \t \n");
        gets(tel[i]);
        fflush(stdin);
    }
}
