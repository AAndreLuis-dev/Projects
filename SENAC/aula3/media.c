#include<stdio.h>

main(){

    float nota1, nota2, nota3, nota4, media;
    int freq;

    printf("Digite sua primeira nota: \n");
    scanf("%f", &nota1);
    fflush(stdin);
    printf("Digite sua segunda nota: \n");
    scanf("%f", &nota2);
    fflush(stdin);
    printf("Digite sua terceira nota: \n");
    scanf("%f", &nota3);
    fflush(stdin);
    printf("Digite sua quarta nota: \n");
    scanf("%f", &nota4);
    fflush(stdin);
    printf("Digite sua frequencia: \n");
    scanf("%i", &freq);

    media = (nota1+nota2+nota3+nota4)/4;

    if (media >= 7 && freq >=70){

            printf("A sua media foi: %.1f \n", media);
            printf("A sua frequencia foi: %.2i \n", freq);
            printf("Você passou de ano! \n");

    } else {
            printf("A sua media foi: %.1f \n", media);
            printf("A sua frequencia foi: %.2i \n", freq);
            printf("Voce reprovou! \n");
    }


}
