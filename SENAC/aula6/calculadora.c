#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>

main(){

    int num[2];
    int i;
    float res = 0;
    int esc;

    do{
            printf("-------------------------------\n");
            printf("--------CALCULADORA EM C-------\n");
            printf("-------------------------------\n");
            printf("[1] - Soma \n");
            printf("[2] - Subtração \n");
            printf("[3] - Multiplicação \n");
            printf("[4] - Divisão \n");
            printf("[5] - IMC \n");
            printf("[6] - Potência \n");
            printf("[7] - Sair \n");
            scanf("%i", &esc);
            fflush(stdin);

            switch(esc){

            case 1:
                system("clear");
                printf("------------------------------------\n");
                printf("---------------Soma-----------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu soma! \n");

                for(i=0;i<=3;i++){
                    printf("Digite o %i ° nota: \n", i+1);
                    scanf("%i", &num[i]);
                    fflush(stdin);
            }

                for(i=0;i<=0;i++){
                    res = (num[0] + num[1]);
                    printf("A soma é: %i \n",res);
                }
            break;
/*
            case 2:
                system("clear");
                printf("------------------------------------\n");
                printf("------------SUBTRAÇÃO---------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu subtração! \n");
                printf("Digite o primeiro número: \n");
                scanf("%f", &n1);
                fflush(stdin);
                printf("Digite o segundo número: \n");
                scanf("%f", &n2);
                fflush(stdin);
                printf("O resultado foi: %1.f \n", n1-n2);
            break;

            case 3:
                system("clear");
                printf("------------------------------------\n");
                printf("-----------Multiplicação------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu multiplicação! \n");
                printf("Digite o primeiro número: \n");
                scanf("%f", &n1);
                fflush(stdin);
                printf("Digite o segundo número: \n");
                scanf("%f", &n2);
                fflush(stdin);
                printf("O resultado foi: %.1f \n", n1*n2);
            break;

            case 4:
                system("clear");
                printf("------------------------------------\n");
                printf("---------------Divisão-------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu divisão! \n");
                printf("Digite o primeiro número: \n");
                scanf("%f", &n1);
                fflush(stdin);
                printf("Digite o segundo número: \n");
                scanf("%f", &n2);
                fflush(stdin);
                if(n2 = 0){
                    printf("Não se divide número por zero. E zero.");
                } else{
                    printf("O resultado foi: %.2f \n", n1*n2);

                }

            break;

            case 5:
                system("clear");
                printf("------------------------------------\n");
                printf("------------------IMC---------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu IMC! \n");
                printf("Digite seu peso: \n");
                scanf("%f", &n1);
                fflush(stdin);
                printf("Digite sua altura: \n");
                scanf("%f", &n2);
                fflush(stdin);
                resultado = n1/(n2*n2);
                printf("O resultado foi: %.1f \n", resultado);

            break;

            case 3:
                system("clear");
                printf("------------------------------------\n");
                printf("-----------POTÊNCIAÇÃO------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu potênciação! \n");
                printf("Digite o primeiro número: \n");
                scanf("%f", &n1);
                fflush(stdin);
                printf("Elevado à: \n");
                scanf("%f", &n2);
                fflush(stdin);
                resultado = = pow(n1, n2);
                printf("O resultado foi: %.1f \n", resultado);
            break;

*/
            }
    } while(esc !=7);



}
