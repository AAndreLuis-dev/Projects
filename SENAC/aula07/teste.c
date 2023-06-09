#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main()
{
    //qtd de letras
    char nome[50][50]; //<- n° posições do vet
    int sexo;
    char idade[10][10];
    float medidas[2];
    float peso, altura;
    float res = 0;


    int i;

    setlocale(LC_ALL, "Portuguese");

    for (i = 0; i <= 0; i++)
    {
        system("clear");
        printf("Digite seu nome: \t");
        gets(nome[i]);
        fflush(stdin);
        printf("Digite sua idade: \t");
        gets(idade[i]);
        fflush(stdin);
        printf("Digite seu gênero(masculino = 1/Feminino = 2): \t");
        scanf("%i", &sexo);
        fflush(stdin);
    }

    for (i = 0; i <= 1; i++)
    {
        printf("Digite seu peso e altura: \t");
        scanf("%f", &medidas[i]);
        fflush(stdin);
    }

    peso = medidas[0];
    altura = medidas[1];

    for (i = 0; i < 1; i++)
    {
        system("clear");
        if (sexo = 1)
        {
            printf("-------------------------------\n");
            printf("-----------BEM-VINDO-----------\n");
            printf("-------------------------------\n");

        } else{
            printf("-------------------------------\n");
            printf("-----------BEM-VINDA-----------\n");
            printf("-------------------------------\n");

        }
        printf("\nNome: %s\t", nome[i]);
        fflush(stdin);
        printf("\nIdade: %s\t", idade[i]);
        fflush(stdin);


        if (sexo = 1)
        {
            printf("\n sexo: Masculino");
        } else{
            printf("\n sexo: Feminino");
        }


        fflush(stdin);
        printf("\nPeso: %.2f\t", medidas[0]);
        fflush(stdin);
        printf("\naltura: %.2f\t", medidas[1]);
        fflush(stdin);
        res = medidas[0]/(medidas[1]*medidas[1]);
        printf("O seu IMC é: %.2f \n",res);


        if (res < 18)
        {
            printf("Você está abaixo do peso!");
        }else{
            if (res >=18 && res <25)
            {
                printf("Você está com peso normal");

            }else{
                if (res >=25 && res <30)
                {
                    printf("Você está com sobrepreso");

                }else{
                    if (res >=30 && res <35)
                    {
                        printf("Você está com obesidade grau I");

                    }else{
                        printf("Você está com obesidade grau II");
                    }

                }

            }

        }


    }



}
