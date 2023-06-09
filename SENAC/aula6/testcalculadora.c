#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>


main(){

    float n[2];
    int i;
    float res = 0;
    int esc;
    int resp;

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

            switch(esc){

            case 1:
                system("clear");
                printf("------------------------------------\n");
                printf("---------------Soma-----------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu soma! \n");

                for(i=0;i<=1;i++){
                    printf("Digite o %i ° numero: \n", i+1);
                    scanf("%f", &n[i]);
                    fflush(stdin);
            }

                for(i=0;i<=0;i++){
                    res = n[0] + n[1];
                    printf("A soma é: %f \n",res);
                }
            break;

            case 2:
                system("clear");
                printf("------------------------------------\n");
                printf("------------SUBTRAÇÃO---------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu subtração! \n");
                for(i=0;i<=1;i++){
                    printf("Digite o %i ° numero: \n", i+1);
                    scanf("%f", &n[i]);
                    fflush(stdin);
            }

                for(i=0;i<=0;i++){
                    res = n[0] - n[1];
                    printf("A subtração é: %.2f \n",res);
                }
            break;

            case 3:
                system("clear");
                printf("------------------------------------\n");
                printf("-----------Multiplicação------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu multiplicação! \n");
                printf("Digite o primeiro número: \n");
                for(i=0;i<=1;i++){
                    printf("Digite o %i ° numero: \n", i+1);
                    scanf("%f", &n[i]);
                    fflush(stdin);
            }

                for(i=0;i<=0;i++){
                    res = n[0] * n[1];
                    printf("A multiplicação é: %.2f \n",res);
                }
            break;

            case 4:
                system("clear");
                printf("------------------------------------\n");
                printf("---------------Divisão-------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu divisão! \n");
                for(i=0;i<=1;i++){
                    printf("Digite o %i ° numero: \n", i+1);
                    scanf("%f", &n[i]);
                    fflush(stdin);
            }

                for(i=0;i<=0;i++){
                    res = n[0] / n[1];
                    if(n[1] != 0){
                            printf("A divisão é: %.2f \n",res);

                    } else{
                            printf("\nNão existe divisão por zero. \n");
                    }

                }
            break;

            case 5:
                system("clear");
                printf("------------------------------------\n");
                printf("------------------IMC---------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu IMC! \n");
                for(i=0;i<=1;i++){
                    printf("Digite seu peso e depois altura: \n");
                    scanf("%f", &n[i]);
                    fflush(stdin);
            }

                for(i=0;i<=0;i++){
                    res = n[0]/(n[1]*n[1]);
                    printf("A divisão é: %.2f \n",res);
                }
            break;

            case 6:
                system("clear");
                printf("------------------------------------\n");
                printf("-----------POTÊNCIAÇÃO------------\n");
                printf("------------------------------------\n");
                printf("Você escolheu potênciação! \n");
                for(i=0;i<=1;i++){
                    printf("Digite o %i ° numero: \n", i+1);
                    scanf("%f", &n[i]);
                    fflush(stdin);
            }


                for(i=0;i<=0;i++){
                    res =  pow(n[1], n[2]);
                    printf("A multiplicação é: %f \n",res);
                }
            break;

        }
    }while(esc !=7);

}
