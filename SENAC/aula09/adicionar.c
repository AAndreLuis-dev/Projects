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
    char nothing[5];

    arquivo = fopen("adicionarcadastro.txt", "a");
    
    if (arquivo == NULL){
        printf("ERRO AO CRIAR, OU MODIFICAR, O ARQUIVO.");
    
    } else{
        fprintf(arquivo, "Pedro\n");
        fprintf(arquivo, "50\n");
        fprintf(arquivo, "4002-8922\n");
        fclose(arquivo);
        printf("Dados gravados com sucesso!!");
    }

}