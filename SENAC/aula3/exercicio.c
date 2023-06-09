#include<stdio.h>

main(){

    int idade;

    printf("Digite sua idade: \n");
    scanf("%i", &idade);

    if (idade >= 18){
        printf("Voce e maior de idade.\n");
    } else {
        printf("Voce e menor de idade.\n");
    }


}
