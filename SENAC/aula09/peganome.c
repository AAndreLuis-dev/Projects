#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

main(){

    setlocale(LC_ALL, "portuguese");

    FILE *arquivo;
    char nome[50];

    arquivo = fopen("nome.txt", "w");
    printf("Digite seu nome: \t");
    fgets(nome, 50, stdin);

    fprintf(arquivo, "%s", nome);
    fclose(arquivo);
    printf("\nNome salvo com sucesso!");


}