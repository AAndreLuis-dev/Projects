#include<stdio.h>
#include<locale.h>

main(){

    setlocale(LC_ALL, "portuguese");

    char nome[10];
    int temp;
    float salario, salariof;

    printf("Digite seu nome: \n");
    gets(nome);
    fflush(stdin);
    printf("Digite seu salario: \n");
    scanf("%f", &salario);
    printf("Digite seu tempo de trabalho(em anos): \n");
    scanf("%i", &temp);

    if (salario >= 1200 && temp >= 2){
        salariof = salario + (salario*5)/100;
        printf("Seu salario foi de : %.2f \n", salario);
        printf("Seu salario, com bonûs, foi de: %.2f \n", salariof);

    } else {
        salariof = salario - (salario*8)/100;
        printf("Seu salario foi de : %.2f \n", salario);
        printf("Seu salario, com desconto, foi de: %.2f \n", salariof);
    }



}
