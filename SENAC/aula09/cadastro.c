#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

main()
{

    setlocale(LC_ALL, "portuguese");

    FILE *arquivo;
    char nome[50];
    int idade;
    char tel[50];
    char nothing[50];

    arquivo = fopen("cadastro.txt", "w");
    if (arquivo == NULL)
    {
        printf("ERRO ao criar ou abrir arquivo");
    }
    else
    {
        printf("Digite um nome: \n");
        fgets(nome, 50, stdin);
        fflush(stdin);
        printf("\nDigite sua idade: \n");
        scanf("%i", &idade);
        fflush(stdin);
        printf("\n");
        gets(nothing);
        fflush(stdin);
        printf("Digite seu telefone: \n");
        fgets(tel, 50, stdin);
        fflush(stdin);
    }

    fprintf(arquivo, "%s", nome);
    fprintf(arquivo, "%i\n", idade);
    fprintf(arquivo, "%s", tel);
    fclose(arquivo);
    printf("Dados gravados com sucesso!!");
}