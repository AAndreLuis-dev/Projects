#include<stdio.h>
#include<locale.h>

main(){

    int day;
    setlocale(LC_ALL, "portugese");

    printf("Digite um numero de 1 à 7. \n");
    scanf("%i", &day);

    switch(day){

    case 1:
            printf("SEGUNDA \n");
        break;

    case 2:
            printf("TERÇA \n");
        break;

    case 3:
            printf("QUARTA \n");
        break;

    case 4:
            printf("QUINTA \n");
        break;

    case 5:
            printf("SEXTA \n");
        break;

    case 6:
            printf("SABADO \n");
        break;

    case 7:
            printf("SEGUNDA \n");
        break;

    default:
            printf("Opção inválida. \n");

    }


}
